package com.example.algorithmstudy.baekjoon_4_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int case1 = sc.nextInt();

        for (int i = 0; i < case1; i++) {
            int std = sc.nextInt();
            int[] arr = new int[std];
            int sum = 0;
            int cnt = 0;
            int avg;
            for (int j = 0; j < arr.length; j++) {
                int score = sc.nextInt();
                arr[j] = score;
            }
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            avg = sum/std;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > avg) {
                    cnt++;
                }
            }
            double result = (double)cnt/std;
            System.out.printf("%.3f%%\n", result*100);
        }
    }
}
