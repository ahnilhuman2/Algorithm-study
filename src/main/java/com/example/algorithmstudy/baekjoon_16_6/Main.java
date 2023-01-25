package com.example.algorithmstudy.baekjoon_16_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int[][] arr;
    public static StringBuilder sb = new StringBuilder();
    public static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        setSudoku(0, 0);
    }

    public static void setSudoku(int x, int y) {
        if (flag) {
            return;
        }
        if (x == 8 && y == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            flag = true;
            return;
        }

        if (y == 9) {
            setSudoku(x + 1, 0);
            return;
        }

        if (arr[x][y] == 0) {
            for (int i = 1; i < 10; i++) {
                if (isValid(i, x, y)) {
                    arr[x][y] = i;
                    setSudoku(x, y + 1);
                }
            }
            arr[x][y] = 0;
        }else {
            setSudoku(x, y + 1);
        }

    }

    public static boolean isValid(int n, int x, int y) {
        for (int i = 0; i < 9; i++) {
            if (arr[i][y] == n) {
                return false;
            }
            if (arr[x][i] == n) {
                return false;
            }
        }

        int sx = (x / 3) * 3;
        int sy = (y / 3) * 3;

        for (int i = sx; i < sx + 3; i++) {
            for (int j = sy; j < sy + 3; j++) {
                if (arr[i][j] ==  n) {
                    return false;
                }
            }
        }
        return true;
    }
}
