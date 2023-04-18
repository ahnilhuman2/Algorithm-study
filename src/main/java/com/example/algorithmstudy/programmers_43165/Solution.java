package com.example.algorithmstudy.programmers_43165;

public class Solution {

    private static int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0);
        return answer;
    }

    public void dfs(int[] numbers, int target, int idx) {
        if (idx == numbers.length) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            if (sum == target) {
                answer++;
            }
            return;
        }

        dfs(numbers, target, idx + 1);

        numbers[idx] *= -1;
        dfs(numbers, target, idx + 1);
    }
}
