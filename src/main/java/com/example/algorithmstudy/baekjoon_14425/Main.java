package com.example.algorithmstudy.baekjoon_14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 고정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        HashSet<String> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        int cnt1 = Integer.parseInt(st.nextToken());
        int cnt2 = Integer.parseInt(st.nextToken());

        for (int i = 0; i < cnt1; i++) {
            set.add(br.readLine());
        }

        int cnt3 = 0;
        for (int i = 0; i < cnt2; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                cnt3++;
            }


        }
        System.out.println(cnt3);
    }
}