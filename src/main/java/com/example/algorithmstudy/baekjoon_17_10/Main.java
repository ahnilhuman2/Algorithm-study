package com.example.algorithmstudy.baekjoon_17_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static Long[][] dp;
    public static int n;
    public static long div = 1000000000L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        dp = new Long[(n + 1)][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long res = 0;

        for (int i = 1; i <= 9; i++) {
            res += stair(n, i);
        }
        sb.append(res % div);
        System.out.println(sb);
    }

    public static long stair(int n, int num) {

        if (n == 1) return dp[n][num];

        if (dp[n][num] == null) {
            if (num == 0) {
                dp[n][num] = stair(n - 1 ,1);

            } else if (num== 9) {
                dp[n][num] = stair(n - 1, 8);

            } else {
                dp[n][num] = stair(n - 1, num - 1) + stair(n - 1, num + 1);
            }
        }
        return dp[n][num] % div;
    }
}
