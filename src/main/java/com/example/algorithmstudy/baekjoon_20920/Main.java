package com.example.algorithmstudy.baekjoon_20920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.length() < K) {
                continue;
            }
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        map.entrySet().stream()
                        .sorted(new Comparator<Map.Entry<String, Integer>>() {
                            @Override
                            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                                if (o1.getValue() == o2.getValue()) {
                                    if (o1.getKey().length() == o2.getKey().length()) {
                                        return o1.getKey().compareTo(o2.getKey());
                                    }
                                    return o2.getKey().length() - o1.getKey().length();
                                }
                                return o2.getValue() - o1.getValue();
                            }
                        })
                        .forEach(stringIntegerEntry -> sb.append(stringIntegerEntry.getKey()).append("\n"));

        System.out.println(sb);
    }
}
