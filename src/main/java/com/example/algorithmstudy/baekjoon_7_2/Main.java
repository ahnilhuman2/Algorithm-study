package com.example.algorithmstudy.baekjoon_7_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 2;
        int start = 2;
        int end = 7;

        while (true) {
            if (a == 1) {
                n = 1;
                break;
            }
            start = start + (6*(n-2));
            end = start + (5 +(6*(n-2)));
            if (a >= start && a <= end) {
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}
