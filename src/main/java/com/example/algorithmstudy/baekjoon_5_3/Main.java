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

                if ((c - d) == (d - e)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print(han(sc.nextInt()));
//    }
//
//    public static int han(int a) {
//        int cnt = 0; // 한수 카운팅
//
//        if (a < 100) {
//            return a;
//        }else {
//            cnt = 99;
//
//            for (int i = 100; i <= a; i++) {
//                int b = i / 100;
//                int c = (i / 10) % 10;
//                int d = i % 10;
//
//                if ((b - c) == (c - d)) {
//                    cnt++;
//                }
//            }
//        }
//        return cnt;
//    }
//}