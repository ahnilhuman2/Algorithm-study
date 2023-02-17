package com.example.algorithmstudy.baekjoon_17_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[] arr;
    public static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        arr = new int[case1 + 1];
        dp = new Integer[case1 + 1];

        for (int i = 1; i < case1 + 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = arr[1];

        if (case1 > 1) {
            dp[2] = arr[1] + arr[2];
        }

        sb.append(recur(case1));
        System.out.println(sb);
    }

    public static int recur(int n) {
        if(dp[n] == null) {
            dp[n] = Math.max(Math.max(recur(n - 2), recur(n - 3) + arr[n - 1]) + arr[n], recur(n - 1));
        }

        return dp[n];
    }
}
