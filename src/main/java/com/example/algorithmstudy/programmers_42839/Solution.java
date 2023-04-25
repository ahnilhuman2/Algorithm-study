package com.example.algorithmstudy.programmers_42839;

import java.util.ArrayList;

public class Solution {
    public int solution(String numbers) {
        int answer = 0;

        int[] arr = new int[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 1; i <= numbers.length(); i++) {
            combination(arr, 0, i, temp);
        }

        for (int num : temp) {
            if (isSosu(num)) {
                answer++;
            }
        }

        return answer;
    }

    public static void combination(int[] arr, int depth, int r, ArrayList<Integer> temp) {
        if (depth == r) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < r; i++) {
                sb.append(arr[i]);
            }
            int num = Integer.parseInt(sb.toString());
            if (num == 0 || temp.contains(num)) {
                return;
            }
            temp.add(num);
            return;
        }

        for (int i = depth; i < arr.length; i++) {
            swap(arr, depth, i);
            combination(arr, depth + 1, r, temp);
            swap(arr, depth, i);
        }
    }

    public static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    public static boolean isSosu(int n) {
        if (n == 1 || n == 0) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}