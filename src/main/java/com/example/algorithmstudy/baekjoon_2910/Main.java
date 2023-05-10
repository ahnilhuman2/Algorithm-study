package com.example.algorithmstudy.baekjoon_2910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> ckMap = new HashMap<>();


        int pw = 0;
        int ck = 0;
        for (int i = 0; i < N; i++) {
            pw = Integer.parseInt(st.nextToken());
            if (map.containsKey(pw)) {
                map.put(pw, map.getOrDefault(pw, 0) + 1);
            } else {
                map.put(pw, 1);
                ckMap.put(pw, ck++);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int n : map.keySet()) {
            list.add(n);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1) == map.get(o2)) {
                    return ckMap.get(o1) - ckMap.get(o2);
                }
                return map.get(o2) - map.get(o1);
            }
        });

        for (int n : list) {
            for (int i = 0; i < map.get(n); i++) {
                sb.append(n).append(" ");
            }
        }
        System.out.println(sb);
    }
}