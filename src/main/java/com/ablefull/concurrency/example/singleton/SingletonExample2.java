package com.ablefull.concurrency.example.singleton;

import com.ablefull.concurrency.annotations.ThreadSafe;

/**
 * @Author Created by D-l
 * 饿汉式单例模式，线程安全
 */

@ThreadSafe
public class SingletonExample2 {

    private static SingletonExample2 instance = new SingletonExample2();

    private SingletonExample2(){

    }

    public static SingletonExample2 getInstance(){
        return instance;
    }
}
