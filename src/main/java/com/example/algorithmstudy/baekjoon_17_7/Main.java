package com.example.algorithmstudy.baekjoon_17_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int case1;
    public static int[][] arr;
    public static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        case1 = Integer.parseInt(br.readLine());

        arr = new int[case1][case1];
        dp = new Integer[case1][case1];
        StringTokenizer st;
        for (int i = 0; i < case1; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < case1; i++) {
            dp[case1 - 1][i] = arr[case1 - 1][i];
        }

        sb.append(res(0,0));
        System.out.println(sb);
    }

    static int res(int depth, int index) {
        if (depth == case1) return dp[depth][index];

        if (dp[depth][index] == null) {
            dp[depth][index] = Math.max(res(depth + 1, index), res(depth + 1, index + 1)) + arr[depth][index];
        }
        return dp[depth][index];
    }
}
