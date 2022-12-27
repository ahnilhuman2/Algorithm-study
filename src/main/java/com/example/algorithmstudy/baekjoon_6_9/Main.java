package com.example.algorithmstudy.baekjoon_6_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int cnt = 0;

        String[] ss = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < ss.length; i++) {
            s = s.replace(ss[i], " ");
        }




//        String[] sss = new String[s.length()];
//        sss = s.split("");
//        int cnt2 = 0;
//
//        for (int i = 0; i < sss.length; i++) {
//            cnt2++;
//        }

        System.out.println(s.length());
    }
}
