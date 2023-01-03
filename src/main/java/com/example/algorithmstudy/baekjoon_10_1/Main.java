package com.example.algorithmstudy.baekjoon_10_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        StringTokenizer 는 띄어쓰기

        int case1 = Integer.parseInt(br.readLine());

        int[] arr = new int[case1];
        int min = Integer.MAX_VALUE;
        int tmp;
        int res;

        for (int i = 0; i < case1; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            res = arr[i];
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }
}
