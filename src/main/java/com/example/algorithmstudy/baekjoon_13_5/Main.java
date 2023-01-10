package com.example.algorithmstudy.baekjoon_13_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            set.add(str);
        }
        int cnt = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String str2 = br.readLine();
            if (set.contains(str2)) {
                cnt++;
                list.add(str2);
            }
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        sb2.append(cnt).append("\n").append(sb);

        System.out.println(sb2);
    }
}
