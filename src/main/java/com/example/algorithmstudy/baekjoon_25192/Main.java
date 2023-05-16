package com.example.algorithmstudy.baekjoon_25192;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if ("ENTER".equals(str)) {
                map = new HashMap<>();
                continue;
            }
            map.put(str, map.getOrDefault(str, 0) + 1);

            if (map.get(str) == 1) {
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
