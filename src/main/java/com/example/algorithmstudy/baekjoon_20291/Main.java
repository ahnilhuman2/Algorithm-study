package com.example.algorithmstudy.baekjoon_20291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("\\.");
            String type = str[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(key);
        }
        Collections.sort(list);

        for (String key : list) {
            sb.append(key).append(" ").append(map.get(key)).append("\n");
        }
        System.out.println(sb);
    }
}
