package com.example.algorithmstudy.baekjoon_17_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt = 0;
    static int dpCnt = 0;
    static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tmp = new int[n];
        fibo(n);
        fibonacci(n);
        System.out.println(cnt);
        System.out.println(dpCnt);
    }

    public static int fibo(int n) {

        if(n == 1 || n == 2){
            cnt++;
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static int fibonacci(int n) {
        tmp[0] = 1;
        tmp[1] = 1;

        for (int i = 2; i < n; i++) {
            dpCnt++;
            tmp[i] = tmp[i-2] + tmp[i-1];
        }
        return tmp[n-1];
    }
}
