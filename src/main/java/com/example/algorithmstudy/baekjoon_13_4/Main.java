package com.example.algorithmstudy.baekjoon_13_4;

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

        int a = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < a; i++) {
            int aaa = Integer.parseInt(st.nextToken());
            if (map.containsKey(aaa)) {
                map.put(aaa, map.get(aaa) + 1);
            }else {
                map.put(aaa, 1);
            }
        }

        int b = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < b; i++) {
            int bbb = Integer.parseInt(st.nextToken());
            if (map.containsKey(bbb)) {
                sb.append(map.get(bbb)).append(" ");
            }else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
