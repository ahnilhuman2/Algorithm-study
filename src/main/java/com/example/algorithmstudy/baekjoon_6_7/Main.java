package com.example.algorithmstudy.baekjoon_6_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();


        String[] s1 = num1.split("");
        String[] s2 = num2.split("");

        String tmp1 = s1[0];
        s1[0] = s1[2];
        s1[2] = tmp1;

        String tmp2 = s2[0];
        s2[0] = s2[2];
        s2[2] = tmp2;

        num1 = s1[0].concat(s1[1]).concat(s1[2]);
        num2 = s2[0].concat(s2[1]).concat(s2[2]);

        System.out.println(Integer.parseInt(num1) > Integer.parseInt(num2) ? num1 : num2);
    }
}
