package com.example.algorithmstudy.baekjoon_1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] good = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            good[i] = Integer.parseInt(st.nextToken());
            map.put(good[i], map.getOrDefault(good[i], 0) + 1);
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int sum = good[i] + good[j];

                if (good[i] == 0 && good[j] == 0) {
                    if (map.getOrDefault(sum, 0) >= 3) {
                        set.add(sum);
                    }
                } else if (good[i] == 0 || good[j] == 0) {
                    if (map.getOrDefault(sum, 0) >= 2) {
                        set.add(sum);
                    }
                } else {
                    set.add(sum);
                }
            }
        }
        for (int n : good) {
            if (set.contains(n)) {
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
