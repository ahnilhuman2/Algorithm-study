package com.example.algorithmstudy.baekjoon_6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        String s = sc.nextLine();
        int sum = 0;
//        String[] sa = new String[s.length()];
//        sa = s.split("");
        String[] ss = s.split("");

//        for (int i = 0; i < a; i++) {
//            sum += (int)s.charAt(i) - 48;
//        }
//
//        System.out.println(sum);


        for (int i = 0; i < ss.length; i++) {
            sum += Integer.parseInt(ss[i]);
        }

        System.out.println(sum);
    }
}
