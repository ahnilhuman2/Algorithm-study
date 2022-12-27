package com.example.algorithmstudy.baekjoon_6_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine().trim();
        if (ss.equals("")) {
            System.out.println(0);
            return;
        }
        String[] s = ss.split("\\s");

        System.out.println(s.length);
    }
}
