package com.example.algorithmstudy.baekjoon_14_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        Integer[] arr = new Integer[3];

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            arr[0] = a;
            arr[1] = b;
            arr[2] = c;

            Arrays.sort(arr, Collections.reverseOrder());

            if (arr[0] * arr[0] == arr[1] * arr[1] + arr[2] * arr[2]) {
                sb.append("right").append("\n");
            }else {
                sb.append("wrong").append("\n");
            }
        }
        System.out.println(sb);

    }
}
