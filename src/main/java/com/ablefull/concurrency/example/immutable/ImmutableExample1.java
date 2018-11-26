package com.ablefull.concurrency.example.immutable;

import com.ablefull.concurrency.annotations.ThreadUnSafe;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @Author Created by D-l
 */

@ThreadUnSafe
public class ImmutableExample1 {

    private static final Integer a = 1;
    private static final String b = "2";
    private static final Map<Integer,Integer> map = Maps.newHashMap();

    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
    }

    public static void main(String[] args) {

    }
}
