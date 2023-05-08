package com.example.algorithmstudy.baekjoon_1302;

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

        int case1 = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        String answer = null;

        for (int i = 0; i < case1; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();
        for (String str : map.keySet()) {
            list.add(str);
        }
        Collections.sort(list);
        int max = 0;

        for (String str : list) {
            if (map.get(str) > max) {
                max = map.get(str);
                answer = str;
            }
        }
        sb.append(answer);
        System.out.println(sb);
    }
}