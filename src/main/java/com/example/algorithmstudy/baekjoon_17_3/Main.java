package com.example.algorithmstudy.baekjoon_17_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        sb.append(jin(N));
        System.out.println(sb);
    }

    public static int jin(int N) {
        if (N == 1) return 1;
        if (N == 2) return 2;

        int res1 = 1;
        int res2 = 2;
        int sum = 0;

        if (N > 2) {
            for (int i = 2; i < N; i++) {
                sum = (res2 + res1) % 15746;
                res1 = res2;
                res2 = sum;
            }
        }
        return sum;
    }
}
