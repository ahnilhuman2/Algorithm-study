package com.example.algorithmstudy.baekjoon_10_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[5];
        int sum = 0;
        int avg;

        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum/5;

        sb.append(avg).append("\n").append(arr[2]);
        System.out.println(sb);
    }
}
