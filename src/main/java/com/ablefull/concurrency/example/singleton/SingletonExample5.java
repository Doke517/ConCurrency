package com.ablefull.concurrency.example.singleton;

import com.ablefull.concurrency.annotations.ThreadSafe;

/**
 * @Author Created by D-l
 * 懒汉式单例模式，双检锁版本，DoubleCheck，加入volatile关键字禁止指令重排序
 */

@ThreadSafe
public class SingletonExample5 {

    private volatile static SingletonExample5 instance = null;

    private SingletonExample5(){

    }

    public static SingletonExample5 getInstance(){
        if(instance == null){
            synchronized (SingletonExample5.class){
                if(instance == null){
                    instance = new SingletonExample5();
                }
            }
        }
        return instance;
    }
}
