package com.example.algorithmstudy.baekjoon_3_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int mid = 0;
        int cnt = 0;
        int res = a;

        while (true) {
            mid = res/10 + res%10;
            res = (res%10)*10 + mid%10;
            cnt++;
            if (res == a) break;
        }
        System.out.println(cnt);
    }
}
