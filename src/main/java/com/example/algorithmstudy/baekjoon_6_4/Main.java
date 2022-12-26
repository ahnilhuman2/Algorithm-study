package com.example.algorithmstudy.baekjoon_6_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int case1 = sc.nextInt();

        for (int i = 0; i < case1; i++) {
            int b = sc.nextInt();
            String ss = sc.next();
            String[] sss = ss.split("");

            for (int j = 0; j < sss.length; j++) {
                for (int k = 0; k < b; k++) {
                    System.out.print(sss[j]);
                }
            }
            System.out.println();
        }
    }
}
