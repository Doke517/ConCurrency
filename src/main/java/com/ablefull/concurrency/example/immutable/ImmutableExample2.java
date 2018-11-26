package com.ablefull.concurrency.example.immutable;

import com.ablefull.concurrency.annotations.ThreadSafe;
import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;

/**
 * @Author Created by D-l
 */

@ThreadSafe
public class ImmutableExample2 {

    private static Map<Integer,Integer> map = Maps.newHashMap();

    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map = Collections.unmodifiableMap(map);
    }

    public static void main(String[] args) {

    }
}
