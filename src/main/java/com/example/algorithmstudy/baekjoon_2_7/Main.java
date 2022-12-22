package com.example.algorithmstudy.baekjoon_2_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result;

        if (a == b && b == c) {
            result = 10000 + (a*1000);
        }else if (a == b || b == c || c == a) {
            if (a == b) {
                result = 1000 + (a * 100);
            }else {
                result = 1000 + (c * 100);
            }
        }else {
            result = (((a > b ? a : b) > c) ? (a > b ? a : b) : c)*100;
        }
        System.out.println(result);
    }
}