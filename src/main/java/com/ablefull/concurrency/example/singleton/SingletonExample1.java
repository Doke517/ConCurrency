package com.ablefull.concurrency.example.singleton;

import com.ablefull.concurrency.annotations.ThreadUnSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author Created by D-l
 */

@ThreadUnSafe
public class SingletonExample1 {

    private static SingletonExample1 INSTANCE = null;

    private SingletonExample1(){

    }

    public static SingletonExample1 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonExample1();
        }
        return INSTANCE;
    }
}
