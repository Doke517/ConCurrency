package com.ablefull.concurrency.example.count;

import com.ablefull.concurrency.annotations.ThreadUnSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by Daniel
 */

@Slf4j
@ThreadUnSafe
public class CountExample1 {
    // 请求总数
    public static int clientTotal = 1000;

    // 同时并发线程数量
    public static int threadTotal = 50;

    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();

        // 信号量
        final Semaphore semaphore = new Semaphore(threadTotal);
        // 计数器
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);

        for(int i = 0;i < clientTotal;i++){
            service.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (InterruptedException e) {
                    log.error("Exception",e);
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        service.shutdown();
        log.info("count: {}",count);
    }

    public static void add(){
        count++;
    }
}
