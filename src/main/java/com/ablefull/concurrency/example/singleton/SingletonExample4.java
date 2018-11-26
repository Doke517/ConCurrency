package com.ablefull.concurrency.example.singleton;

import com.ablefull.concurrency.annotations.ThreadUnSafe;

/**
 * @Author Created by D-l
 * 懒汉式单例模式，双检锁版本，DoubleCheck
 */

@ThreadUnSafe
public class SingletonExample4 {

    private static SingletonExample4 instance = null;

    private SingletonExample4(){

    }

    public static SingletonExample4 getInstance(){
        if(instance == null){
            synchronized (SingletonExample4.class){
                if(instance == null){
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }
}
