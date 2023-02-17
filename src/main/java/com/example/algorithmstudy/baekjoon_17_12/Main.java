package com.example.algorithmstudy.baekjoon_17_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static int[] arr;
    public static Integer[] dp;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int case1 = Integer.parseInt(br.readLine());
        arr = new int[case1];
        dp = new Integer[case1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < case1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < case1; i++) {
            LIS(i);
        }

        int max = dp[0];

        for (int i = 1; i < case1; i++) {
            max = Math.max(max, dp[i]);
        }

        sb.append(max);
        System.out.println(sb);
        
        
    }

    public static int LIS(int n) {
        if (dp[n] == null) {
            dp[n] = 1;

            for(int i = n - 1; i >= 0; i--) {
                if(arr[i] < arr[n]) {
                    dp[n] = Math.max(dp[n], LIS(i) + 1);
                }
            }
        }
        return dp[n];
    }
}
