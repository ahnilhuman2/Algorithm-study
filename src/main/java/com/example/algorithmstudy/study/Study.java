package com.example.algorithmstudy.study;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Study {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int a = 9;
        AtomicInteger integer2 = new AtomicInteger();
        int cnt = 0;

        Arrays.stream(arr).boxed()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        integer2.incrementAndGet();
                        return integer == a;
                    }
                }).min(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                }).ifPresent(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });
        Arrays.sort(arr);
//        Collections.sort();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();



    }

    private static int t = 0;

    public static int g(int x) {
        t++;
        return t + x;
    }
}
