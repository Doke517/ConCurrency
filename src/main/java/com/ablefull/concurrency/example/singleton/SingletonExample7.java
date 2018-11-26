package com.ablefull.concurrency.example.singleton;

import com.ablefull.concurrency.annotations.Recommend;
import com.ablefull.concurrency.annotations.ThreadSafe;

/**
 * @Author Created by D-l
 * 枚举方式实现单例模式
 */

@ThreadSafe
@Recommend
public class SingletonExample7 {

    private SingletonExample7(){

    }

    public static SingletonExample7 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonExample7 singleton;

        Singleton(){
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance(){
            return singleton;
        }
    }
}
