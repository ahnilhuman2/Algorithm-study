package com.example.algorithmstudy.baekjoon_8_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            boolean isPrime = true;
            if (i == 1) isPrime = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                if (min > i) {
                    min = i;
                }
                sum += i;
            }
        }
        if (sum == 0) {
            sum = -1;
            System.out.println(sum);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
