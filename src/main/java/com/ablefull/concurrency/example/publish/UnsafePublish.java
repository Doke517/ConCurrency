package com.ablefull.concurrency.example.publish;

import com.ablefull.concurrency.annotations.ThreadUnSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author Created by D-l
 */

@Slf4j
@ThreadUnSafe
public class UnsafePublish {

    private String[] states = {"a","b","c"};

    public String[] getStates(){
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();

    }
}
