package com.example.algorithmstudy.baekjoon_13_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            int aaa = Integer.parseInt(st.nextToken());
            set.add(aaa);
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < b; i++) {
            int bbb = Integer.parseInt(st.nextToken());
            set2.add(bbb);
        }
        int cnt = 0;
        for (int s1 : set2) {
            if (set.contains(s1)) {
                cnt++;
            }
        }
        System.out.println(set.size() + set2.size() - 2*cnt);
    }
}
