package com.example.algorithmstudy.baekjoon_11_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, n) - 1)).append('\n');
        move(n, 1, 2, 3);
        System.out.println(sb);

    }

    public static void move(int n, int start, int mid, int to) {
        if (n == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        move(n - 1, start, to, mid);
        sb.append(start + " " + to + "\n");
        move(n - 1, mid, start, to);
    }
}
