package com.ablefull.concurrency.example.atomic;

import com.ablefull.concurrency.annotations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Daniel
 */

@Slf4j
@ThreadSafe
public class AtomicExample5 {
    // 更新某个指定的类的某个字段的值，这个字段一定要是非static，并且被volatile修饰的
    private static AtomicIntegerFieldUpdater<AtomicExample5> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class,"count");

    @Getter
    private volatile int count = 100;

    private static AtomicExample5 atomicExample5 = new AtomicExample5();

    public static void main(String[] args) {
        if(updater.compareAndSet(atomicExample5,100,120)){
            log.info("update success: {}",atomicExample5.getCount());
        }

        if(updater.compareAndSet(atomicExample5,100,120)){
            log.info("update success: {}",atomicExample5.getCount());
        }else{
            log.info("update failed: {}",atomicExample5.getCount());
        }
    }
}
