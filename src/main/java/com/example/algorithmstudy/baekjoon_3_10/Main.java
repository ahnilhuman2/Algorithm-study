package com.example.algorithmstudy.baekjoon_3_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int result;

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            result = a + b;
            System.out.println(result);
        }
    }
}
