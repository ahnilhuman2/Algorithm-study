package com.example.algorithmstudy.baekjoon_15_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (a >= 5) {
            cnt += (a / 5);
            a /= 5;
        }

        System.out.println(cnt);


    }
//
//    public static int factorial(int a) {
//        if (a == 1) {
//            return 1;
//        }
//        return factorial(a - 1) * a;
//    }
}
