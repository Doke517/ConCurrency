package com.ablefull.concurrency.example.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Daniel
 */

@Slf4j
public class SynchronizedExample2 {

    /**
     * 修饰类
     */
    public void test1(int temp){
        synchronized (SynchronizedExample2.class){
            for(int i = 0;i < 10;i++){
                log.info("test1 {} - {}",temp,i);
            }
        }
    }

    /**
     * 修饰静态方法
     */
    public synchronized static void test2(int temp){
        for(int i = 0;i < 10;i++){
            log.info("test2 {} - {}",temp,i);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample2 example1 = new SynchronizedExample2();
        SynchronizedExample2 example2 = new SynchronizedExample2();

        ExecutorService service = Executors.newCachedThreadPool();

        service.execute(() -> {
            example1.test1(1);
        });

        service.execute(() -> {
            example2.test1(2);
        });

        service.shutdown();
    }
}
