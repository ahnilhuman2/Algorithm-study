package com.example.algorithmstudy.baekjoon_10_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int case1 = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[case1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < case1; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        Arrays.sort(arr, Collections.reverseOrder());
        sb.append(arr[cut - 1]);

        System.out.println(sb);
    }
}
