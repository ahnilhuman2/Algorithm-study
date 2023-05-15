package com.example.algorithmstudy.baekjoon_2002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
           map.put(br.readLine(), i);
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            arr[i] = map.get(str);
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                    break;
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
