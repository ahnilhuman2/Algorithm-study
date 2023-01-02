package com.example.algorithmstudy.baekjoon_8_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt;

        while (true) {
            int m = Integer.parseInt(br.readLine());
            cnt = m;
            if (m == 0) break;

            for (int i = m + 1; i <= (2*m); i++) {
                if (i == 1) cnt--;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i%j == 0) {
                        cnt--;
                        break;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);

    }
}
