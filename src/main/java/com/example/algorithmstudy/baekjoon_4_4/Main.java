package com.example.algorithmstudy.baekjoon_4_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;

            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
