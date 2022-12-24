package com.example.algorithmstudy.baekjoon_5_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        System.out.println(han(b));

    }

    public static int han(int b) {
        int cnt = 0;

        if (b < 100) {
            return b;
        }else {
            cnt = 99;

            for (int i = 100; i <= b ; i++) {
                int c = i/100;
                int d = (i/10)%10;
                int e = i%10;

                if ((c - d) == (d - c)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
