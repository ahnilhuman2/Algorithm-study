package com.example.algorithmstudy.baekjoon_8_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int j = 2; j <= a; j++) {
            if (a%j == 0) {
                sb.append(j).append("\n");
                a/=j;
                j--;
            }
        }
        System.out.println(sb);
    }
}
