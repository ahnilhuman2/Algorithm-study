package com.example.algorithmstudy.baekjoon_12_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        int[][] arr = new int[case1][2];

        StringTokenizer st;

        for (int i = 0; i < case1; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            arr[i][0] = weight;
            arr[i][1] = height;
        }


        for (int i = 0; i < case1; i++) {
            int grade = 1;
            for (int j = 0; j < case1; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    grade++;
                }
            }
            sb.append(grade).append(" ");
        }


        System.out.print(sb);

    }
}
