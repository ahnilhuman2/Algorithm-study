package com.example.algorithmstudy.baekjoon_11_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());


        for (int i = 0; i < case1; i++) {
            String str = br.readLine();
            result = 0;
            sb.append(isPalindrome(str)).append(" ").append(result).append("\n");
        }
        System.out.println(sb);

    }

    public static int recursion(String s, int l, int r) {
        result++;

        if (l >= r) {
            return 1;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return 0;
        }
        return  recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
            return recursion(s, 0, s.length()-1);
        }

}
