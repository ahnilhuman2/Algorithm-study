package com.example.algorithmstudy.baekjoon_13_3;

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

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<String, Integer> mapName = new HashMap<>();
        Map<Integer, String> mapNum = new HashMap<>();

        for (int i = 1; i <= a; i++) {
            String name = br.readLine();
            mapName.put(name, i);
            mapNum.put(i, name);
        }

        for (int i = 1; i <= b; i++) {
            String str = br.readLine();
            char ch = str.charAt(0);
            boolean isNum = false;

            if ('1' <= ch && ch <= '9') {
                isNum = true;
            }
            if (isNum) {
                sb.append(mapNum.get(Integer.parseInt(str))).append("\n");
            } else {
                sb.append(mapName.get(str)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
