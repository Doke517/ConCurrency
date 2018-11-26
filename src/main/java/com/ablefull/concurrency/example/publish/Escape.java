package com.ablefull.concurrency.example.publish;

import com.ablefull.concurrency.annotations.ThreadUnSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author Created by D-l
 */

@ThreadUnSafe
@Slf4j
public class Escape {
    private int thisCanBeEscape = 0;

    public Escape(){
        new InnerClass();
    }

    private class InnerClass{
        public InnerClass(){
            log.info("{}",Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
