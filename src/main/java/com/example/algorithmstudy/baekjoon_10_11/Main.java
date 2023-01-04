package com.example.algorithmstudy.baekjoon_10_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        String[][] arr =  new String[case1][2];

        for (int i = 0; i < case1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();

            arr[i][0] = age;
            arr[i][1] = name;
        }

        Arrays.sort(arr, (String[] o1, String[] o2) ->
                o1[0] ==  o2[0] ? 1 : Integer.parseInt(o1[0]) - Integer.parseInt(o2[0])
                );

        for (int i = 0; i < case1; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
