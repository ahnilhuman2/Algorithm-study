package com.example.algorithmstudy.baekjoon_9_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];

        StringTokenizer st;
        int cnt  = 0;

        for (int k = 0; k < case1; k++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int i = a; i < (a+10); i++) {
                for (int j = b; j < (b+10); j++) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
