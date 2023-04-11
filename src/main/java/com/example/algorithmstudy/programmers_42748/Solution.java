package com.example.algorithmstudy.programmers_42748;

import java.util.Arrays;

public class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//
//        int[] array2;
//        int[] answer = new int[commands.length];
//        int tmp;
//
//        for (int i = 0; i < commands.length; i++) {
//            array2 = new int[commands[i][1] - commands[i][0] + 1];
//            System.arraycopy(array, array[commands[i][0]], array2, 0, array[commands[i][1]]);
//            Arrays.sort(array2);
//            tmp = array2[commands[i][2]];
//        }
//        for (int j = 0; j < commands.length; j++) {
//            answer[j] = tmp;
//        }
//
//        return answer;
//    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int s = commands[i][0] - 1;
            int e = commands[i][1] - 1;
            int idx = commands[i][2] - 1;

            int[] array2 = Arrays.copyOfRange(array, s, e + 1);
            Arrays.sort(array2);
            answer[i] = array2[idx];
        }
        return answer;
    }
}
