package com.example.algorithmstudy.baekjoon_17_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static Integer[] dp;
    public static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        arr = new int[num];
        dp = new Integer[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        max = dp[0];
        next(num - 1);

        sb.append(max);
        System.out.println(sb);
    }

    public static int next(int num) {
        if (dp[num] == null) {
            dp[num] = Math.max(next(num - 1) + arr[num], arr[num]);
            max = Math.max(dp[num], max);
        }
        return dp[num];
    }
}
