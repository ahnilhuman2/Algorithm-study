package com.example.algorithmstudy.baekjoon_7_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int case1 = sc.nextInt();
        int[][] arr = new int[15][15];

        for (int i = 0; i < 15; i++) {
            arr[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            arr[i][1] = 1;
            for (int j = 2; j < 15; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < case1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(arr[a][b]);
        
        }
    }
}
