package com.example.algorithmstudy.programmers_12901;

public class Solution {
    public String solution(int a, int b) {
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int date = 0;

        for (int i = 1; i < a; i++) {
            date += month[i];
        }
        date  = date + b;
        return week[date % 7];
    }
}
