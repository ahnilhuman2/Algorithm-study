package com.example.algorithmstudy.baekjoon_11_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class review {

    public static StringBuilder sb = new StringBuilder();
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        hanoi(n, 1, 2, 3);

        System.out.println(cnt);
        System.out.println(sb);

    }

    public static void hanoi(int n, int start, int mid, int end) {
        if (n == 1) {
            move(start, end);
            return;
        }
        hanoi(n - 1, start, end, mid);
        move(start, end);
        hanoi(n - 1, mid, start, end);
    }

    public static void move(int start, int end) {
        sb.append(start).append(" ").append(end).append("\n");
        cnt++;
    }
}
