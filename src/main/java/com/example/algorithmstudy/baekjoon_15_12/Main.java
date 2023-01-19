package com.example.algorithmstudy.baekjoon_15_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long five = five(a) - five(a - b) - five(b);
        long two = two(a) - two(a - b) - two(b);

        System.out.println(Math.min(five, two));
    }

    public static long five(long n) {
        int cnt = 0;

        while (n >= 5) {
            cnt += (n / 5);
            n /= 5;
        }
        return cnt;
    }

    public static long two(long n) {
        int cnt = 0;

        while (n >= 2) {
            cnt += (n / 2);
            n /= 2;
        }
        return cnt;
    }
}
