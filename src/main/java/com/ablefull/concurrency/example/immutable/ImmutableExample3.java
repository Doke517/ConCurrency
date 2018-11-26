package com.ablefull.concurrency.example.immutable;

import com.ablefull.concurrency.annotations.ThreadSafe;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/**
 * @Author Created by D-l
 */

@ThreadSafe
public class ImmutableExample3 {

    private static final ImmutableList list = ImmutableList.of(1,2,3);

    private static final ImmutableSet set = ImmutableSet.copyOf(list);

    private static final ImmutableMap map = ImmutableMap.of(1,2,3,4);

    private static final ImmutableMap map2 = ImmutableMap.builder().put(1,2).put(3,4).build();

    public static void main(String[] args) {

    }
}
