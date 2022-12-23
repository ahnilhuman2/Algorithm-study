package com.example.algorithmstudy.baekjoon_4_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int max = -1000001;
        int min = 1000001;

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            if (max < x) {
                max = x;
            }
            if (min > x) {
                min = x;
            }
        }
        System.out.println(min + " " + max);
    }
}
