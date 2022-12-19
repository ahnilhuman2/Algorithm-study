package com.example.algorithmstudy.baekjoon_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        HashSet<Integer> set = new HashSet<>();
        int cnt1 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cnt1; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        int cnt2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cnt2; i++) {
            int num = Integer.parseInt(st.nextToken());
            int res;
            if (set.contains(num)) {
                res = 1;
            }else {
                res = 0;
            }

            sb.append(res).append(" ");


        }
        System.out.println(sb);
    }
}