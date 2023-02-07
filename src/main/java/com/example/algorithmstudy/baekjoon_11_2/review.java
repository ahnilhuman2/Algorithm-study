package com.example.algorithmstudy.baekjoon_11_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        sb.append(fibo(a));
        System.out.println(sb);
    }

    public static int fibo(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        return fibo(a - 1) + fibo(a - 2);
    }
}
