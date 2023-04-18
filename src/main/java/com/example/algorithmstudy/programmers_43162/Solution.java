package com.example.algorithmstudy.programmers_43162;

public class Solution {

    static boolean[][] linked;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        linked = new boolean[n][n];

        for (int i = 0; i < computers.length; i++) {
            if (!linked[i][i]) {
                answer++;
                dfs(n, computers, i);
            }
        }
        return answer;
    }

    public void dfs(int n, int[][] computers, int depth) {
        if (depth == n) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (computers[depth][i] == 1 && !linked[depth][i]) {
                linked[depth][i] = true;
                linked[i][depth] = true;
                dfs(n, computers, i);
            }
        }
    }
}
