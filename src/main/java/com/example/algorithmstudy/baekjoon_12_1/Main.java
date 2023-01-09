package com.example.algorithmstudy.baekjoon_12_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int card = Integer.parseInt(st.nextToken());
        int result = Integer.parseInt(st.nextToken());

        int[] arr = new int[card];

        st =  new StringTokenizer(br.readLine());
        for (int i = 0; i < card; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < card - 2; i++) {
            for (int j = i + 1; j < card - 1; j++) {
                for (int k = j + 1; k < card; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum <= result && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
