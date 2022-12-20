package com.example.algorithmstudy.baekjoon_2_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b < 45) {
            a--;
            if (a < 0) {
                a = 24 + a;
            }
            b = 60 + (b - 45);
        }else {
            b = b - 45;
        }
        System.out.println(a + " " + b);
    }
}