package com.example.algorithmstudy.baekjoon_2_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        a = a + c/60;
        b = b + c%60;
        if (b >= 60) {
            a++;
            b = b - 60;
        }
        if (a >= 24) {
            a = a - 24;
        }
        System.out.println(a + " " + b);
    }
}