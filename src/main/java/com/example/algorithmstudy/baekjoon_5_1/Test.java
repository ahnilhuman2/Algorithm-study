package com.example.algorithmstudy.baekjoon_5_1;

public class Test {
    public long sum(int[] a) {
        long b = 0L;
        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        return b;
    }
}
