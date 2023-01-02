package com.example.algorithmstudy.baekjoon_8_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int case1 = sc.nextInt();
        int cnt = case1;

        for (int i = 0; i < case1; i++) {
            int b = sc.nextInt();
            if (b == 1) cnt--;
            for (int j = 2;j <= Math.sqrt(b); j++) {
                if (b % j == 0) {
                    cnt--;
                    break;
                }
            }


        }
        System.out.println(cnt);
    }
}
