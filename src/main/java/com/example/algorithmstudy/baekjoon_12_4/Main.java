package com.example.algorithmstudy.baekjoon_12_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        arr = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            String str = br.readLine();
            for (int j = 0; j < col; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                }else {
                    arr[i][j] = false;
                }
            }
        }
        int N_row = row - 7;
        int M_col = col - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                count(i, j);
            }
        }
        System.out.println(min);

    }
    public static void count(int x, int y) {
        int cnt = 0;

        boolean TF = arr[x][y];    // 첫 번째 칸의 색

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {

                // 올바른 색이 아닐경우 count 1 증가
                if (arr[i][j] != TF) {
                    cnt++;
                }
                TF = (!TF);
            }
            TF = !TF;
        }
        cnt = Math.min(cnt, 64 - cnt);

        min = Math.min(min, cnt);
    }
}
