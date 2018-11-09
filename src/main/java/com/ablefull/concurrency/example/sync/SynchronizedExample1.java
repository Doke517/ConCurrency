package com.ablefull.concurrency.example.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Daniel
 */

@Slf4j
public class SynchronizedExample1 {

    /**
     * 修饰代码块
     */
    public void test1(int temp){
        synchronized (this){
            for(int i = 0;i < 10;i++){
                log.info("test1 {} - {}",temp,i);
            }
        }
    }

    /**
     * 修饰成员方法
     */
    public synchronized void test2(int temp){
        for(int i = 0;i < 10;i++){
            log.info("test2 {} - {}",temp,i);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample1 example1 = new SynchronizedExample1();
        SynchronizedExample1 example2 = new SynchronizedExample1();

        ExecutorService service = Executors.newCachedThreadPool();

        service.execute(() -> {
            example1.test2(1);
        });

        service.execute(() -> {
            example2.test2(2);
        });

        service.shutdown();
    }
}
