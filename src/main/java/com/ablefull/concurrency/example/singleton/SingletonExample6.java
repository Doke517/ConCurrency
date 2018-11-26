package com.ablefull.concurrency.example.singleton;

import com.ablefull.concurrency.annotations.ThreadSafe;

/**
 * @Author Created by D-l
 * 饿汉式单例模式，线程安全，使用静态块的方法创建单例模式
 */

@ThreadSafe
public class SingletonExample6 {

    private static SingletonExample6 instance;

    static{
        instance = new SingletonExample6();
    }

    private SingletonExample6(){

    }

    public static SingletonExample6 getInstance(){
        return instance;
    }
}
