package com.ablefull.concurrency.example.threadlocal;

/**
 * @Author Created by D-l
 */
public class RequestHolder {

    private static final ThreadLocal<Long> requestHolder = new ThreadLocal<>();

    public RequestHolder(){

    }

    public static void add(Long id){
        requestHolder.set(id);
    }

    public static Long getId(){
        return requestHolder.get();
    }

    public static void remove(){
        requestHolder.remove();
    }
}
