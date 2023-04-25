package com.example.algorithmstudy.programmers_42842;

public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int width = 0;
        int height = 0;
        int ext = brown + yellow;

        for (int i = 1; i <= ext; i++) {
            if (ext % i == 0) {
                width = i;
                height = ext / i;
                if (width >= height && (width - 2) * (height - 2) == yellow) {
                    answer = new int[]{width, height};
                    break;
                }
            }
        }

        return answer;
    }
}
