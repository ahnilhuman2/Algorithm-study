package com.example.algorithmstudy.baekjoon_17_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int N;
    public static int[] stairs;
    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        stairs = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];

        sb.append(maxValue(N));
        System.out.println(sb);
    }

    public static int maxValue(int n) {

        if (dp[n] != 0) {
            return dp[n];
        }

        for (int i = 3; i <= n; i++) {
            int res = Math.max(stairs[i] + stairs[i - 1] + dp[i - 3], stairs[i] + dp[i - 2]);
            dp[i] = res;
        }

        return dp[n];
    }
}
