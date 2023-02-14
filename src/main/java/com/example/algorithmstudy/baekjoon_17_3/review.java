package com.example.algorithmstudy.baekjoon_17_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class review {

    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        dp = new int[1000001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        sb.append(answer(n));
        System.out.println(sb);
    }

    public static int answer(int n) {

        if (dp[n] != 0) return dp[n];

        return dp[n] = (answer(n - 1) + answer(n - 2)) % 15746;

    }
}
