package com.example.algorithmstudy.baekjoon_12_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append(bb(n));
        System.out.println(sb);
    }

    public static int bb(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int num = i;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (n == sum + i) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
