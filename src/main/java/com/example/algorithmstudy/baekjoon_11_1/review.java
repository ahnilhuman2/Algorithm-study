package com.example.algorithmstudy.baekjoon_11_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        sb.append(factorial(a));
        System.out.println(sb);

    }

    public static int factorial(int a) {
        if (a <= 1) return 1;
        return a * factorial(a - 1);
    }
}
