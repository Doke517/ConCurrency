package com.ablefull.concurrency.example.singleton;

import com.ablefull.concurrency.annotations.ThreadSafe;
import com.ablefull.concurrency.annotations.UnRecommend;

/**
 * @Author Created by D-l
 * 懒汉式单例模式，增加了synchronized关键字
 */

@ThreadSafe
@UnRecommend
public class SingletonExample3 {

    private static SingletonExample3 instance = null;

    private SingletonExample3(){

    }

    public static synchronized SingletonExample3 getInstance(){
        if(instance == null){
            instance = new SingletonExample3();
        }
        return instance;
    }
}
