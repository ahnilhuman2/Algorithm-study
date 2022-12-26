package com.example.algorithmstudy.baekjoon_6_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ss = sc.nextLine();

        for (int i = 'a'; i < 'z'; i++) {
            int idx = -1;
            for (int j = 0; j < ss.length(); j++) {
                if (i == ss.charAt(j)) {
                    idx = j;
                    break;
                }
            }
            System.out.print(idx + " ");
        }
    }
}
