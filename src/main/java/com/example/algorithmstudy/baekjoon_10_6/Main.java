package com.example.algorithmstudy.baekjoon_10_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        int[] arr = new int[case1];
        int cnt = 0;

        int sum = 0;
        for (int i = 0; i < case1; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
            sum += a;
        }


        Arrays.sort(arr);
        int avg;
        int midValue = 0;
        int midIdx = 0;
        int snum = 0;
        int range = 0;



        midIdx = arr.length/2;



        avg = Math.round((float)sum/arr.length);
        midValue = arr[midIdx];
        range = arr[case1 - 1] - arr[0];

        sb.append(avg).append("\n").append(midValue).append("\n").append(snum).append("\n").append(range);

        System.out.println(sb);
    }
}

