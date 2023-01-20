package com.example.algorithmstudy.baekjoon_2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                K--;
            }
            //k번째 약수이면 i 출력
            if (K == 0) {
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
    }
}
