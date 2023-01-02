package com.example.algorithmstudy.baekjoon_8_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());

        while(case1-- > 0) {
            int a = Integer.parseInt(br.readLine());
            for(int i = a/2; i > 0; i--) {
                int x = i;
                int y = a - x;
                if (isPrime(x) && isPrime(y)) {
                    sb.append(x).append(" ").append(y).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n%j == 0) return false;
        }
        return true;
    }
}
