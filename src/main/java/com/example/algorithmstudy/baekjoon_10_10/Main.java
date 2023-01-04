package com.example.algorithmstudy.baekjoon_10_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < case1; i++) {
            String str = br.readLine();
            list.add(str);
        }
        list = new ArrayList<>(new HashSet<>(list));

//        Comparator<String> c = new Comparator<String>() {
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };
        Collections.sort(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

//        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
