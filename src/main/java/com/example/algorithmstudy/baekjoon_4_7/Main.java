package com.example.algorithmstudy.baekjoon_4_7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        double sum= 0;
        for (int i = 0; i < arr.length; i++) {
            sum += 100.0*arr[i]/max;
        }

        System.out.println(sum/a);
    }
}
