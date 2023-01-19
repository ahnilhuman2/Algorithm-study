package com.example.algorithmstudy.baekjoon_15_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < case1; i++) {

            Map<String, Integer> map = new HashMap<>();
            int case2 = Integer.parseInt(br.readLine());

            for (int j = 0; j < case2; j++) {

                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type =  st.nextToken();

                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int res = 1;

            for (int a : map.values()) {
                res *= (a + 1);
            }

            sb.append(res - 1).append('\n');
        }

        System.out.println(sb);
    }
}
