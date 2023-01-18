package com.example.algorithmstudy.baekjoon_15_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        sb.append(gcd(a, b)).append("\n").append(lcm(a, b));

        System.out.println(sb);

    }

    public static int gcd(int a, int b) {
        int c = a > b ? b : a;
        for (int i = c; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
