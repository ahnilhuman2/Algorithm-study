package com.example.algorithmstudy.baekjoon_14_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int res1 = x;
        int res2 = y;
        int res3 = w - x;
        int res4 = h - y;

        int[] arr = {res1, res2, res3, res4};

        Arrays.sort(arr);

//        Math.min(Math.min(x, y), Math.min(w - x, h - y));

        System.out.println(arr[0]);
    }
}
