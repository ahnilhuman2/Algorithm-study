package com.example.algorithmstudy.baekjoon_16_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static int N;
    public static int M;
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit =  new boolean[N + 1];

        dfs(N, M , 0);

        System.out.println(sb);

    }

    public static void dfs(int N, int M, int depth) {
        if (M == depth) {
            for (int n : arr) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }

        }


    }
}
