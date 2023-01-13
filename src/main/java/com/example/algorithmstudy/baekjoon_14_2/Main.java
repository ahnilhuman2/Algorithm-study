package com.example.algorithmstudy.baekjoon_14_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map1.put(x, map1.getOrDefault(x, 0) + 1);
            map2.put(y, map2.getOrDefault(y, 0) + 1);

        }

        for(int a : map1.keySet()) {
            if (map1.get(a) == 1) {
                sb.append(a).append(" ");
            }
        }
        for(int a : map2.keySet()) {
            if (map2.get(a) == 1) {
                sb.append(a);
            }
        }
        System.out.println(sb);
    }
}
