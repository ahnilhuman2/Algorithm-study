package com.example.algorithmstudy.baekjoon_16_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int num;
    public static int[] arr;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        arr = new int[num];
        queen(0);

        System.out.println(cnt);
    }

    public static boolean possible(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            }else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static void queen(int depth) {
        if (depth == num) {
            cnt++;
            return;
        }
        for (int i = 0; i < num; i++) {
            arr[depth] = i;
            // 놓을 수 있는 위치일 경우 재귀호출
            if (possible(depth)) {
                queen(depth + 1);
            }
        }
    }
}
