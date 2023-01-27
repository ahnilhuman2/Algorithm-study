package com.example.algorithmstudy.baekjoon_16_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int caseNum;
    public static int[] operator = new int[4];
    public static int[] number;
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        caseNum = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        number = new int[caseNum];
        for (int i = 0; i < caseNum; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < operator.length; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(number[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int num, int depth) {
        if (caseNum == depth) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;
                if (i == 0) {
                    dfs(num + number[depth], depth + 1);
                } else if (i == 1) {
                    dfs(num - number[depth], depth + 1);
                } else if (i == 2) {
                    dfs(num * number[depth], depth + 1);
                } else if (i == 3) {
                    dfs(num / number[depth], depth + 1);
                }
                operator[i]++;
            }
        }
    }
}
