package com.example.algorithmstudy.baekjoon_14_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < case1; i++) {
            st = new StringTokenizer(br.readLine());
            double x1 = Integer.parseInt(st.nextToken());
            double y1 = Integer.parseInt(st.nextToken());
            double r1 = Integer.parseInt(st.nextToken());
            double x2 = Integer.parseInt(st.nextToken());
            double y2 = Integer.parseInt(st.nextToken());
            double r2 = Integer.parseInt(st.nextToken());

            int d = (int)(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            int result = 0;

            double mp = Math.pow(r2 - r1, 2);
            double pp = Math.pow(r2 + r1, 2);

            if(x1 == x2 && y1 == y2 && r1 == r2){
                result = -1;
            }else if (d > pp || d < mp) {
                result = 0;
            }else if (d == pp || d == mp) {
                result = 1;
            }else {
                result = 2;
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);

    }
}
