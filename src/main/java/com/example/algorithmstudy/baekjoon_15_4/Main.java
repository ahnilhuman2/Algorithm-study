package com.example.algorithmstudy.baekjoon_15_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < case1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int c = a > b ? b : a;
            int gcd = 0;

            for (int j = c; j > 0; j--) {
                if (a % j == 0 && b % j == 0) {
                    gcd = j;
                    break;
                }
            }
            sb.append(a * b / gcd).append("\n");
        }

        System.out.println(sb);
    }
}
