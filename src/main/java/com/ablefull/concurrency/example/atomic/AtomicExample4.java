package com.ablefull.concurrency.example.atomic;

import com.ablefull.concurrency.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by Daniel
 */

@Slf4j
@ThreadSafe
public class AtomicExample4 {
    private static AtomicReference<Integer> count = new AtomicReference<>(0);

    public static void main(String[] args) {
        count.compareAndSet(0,1);
        count.compareAndSet(1,2);
        count.compareAndSet(2,3);
        count.compareAndSet(3,4);
        log.info("count: {}",count.get());
    }
}
