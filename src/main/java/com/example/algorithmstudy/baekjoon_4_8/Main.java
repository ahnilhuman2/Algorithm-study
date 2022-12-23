package com.example.algorithmstudy.baekjoon_4_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        while(cnt-- > 0) {
            int result = 0;
            int mid = 0;
            String str = br.readLine();
            for(int i = 0; i < str.length(); i++) {
                char ox = str.charAt(i);
                if (ox == 'O') {
                    mid++;
                    result = result + mid;
                } else {
                    mid = 0;
                }
            }
            System.out.println(result);
        }
    }
}
