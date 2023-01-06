package com.example.algorithmstudy.baekjoon_11_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("ABBA: " + isPalindrome("ABBA"));
        System.out.println("ABC: " + isPalindrome("ABC"));

    }

        public static int recursion(String s, int l, int r){
            if(l >= r) return 1;
            else if(s.charAt(l) != s.charAt(r)) return 0;
            else return recursion(s, l+1, r-1);
        }
        public static int isPalindrome(String s){
            return recursion(s, 0, s.length()-1);
        }


}
