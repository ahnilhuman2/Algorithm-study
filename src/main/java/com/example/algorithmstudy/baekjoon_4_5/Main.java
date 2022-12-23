package com.example.algorithmstudy.baekjoon_4_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[30];

        for (int i = 0; i < arr.length-2; i++) {
            int a = sc.nextInt();
            arr[a - 1] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.println(i+1);
            }
        }

    }
}
