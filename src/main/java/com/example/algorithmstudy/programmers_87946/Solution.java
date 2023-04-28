package com.example.algorithmstudy.programmers_87946;

public class Solution {

    static boolean visited[];
    static int answer = 0;

    public int solution(int k, int[][] dungeons) {
        answer = -1;
        visited = new boolean[dungeons.length];
        success(dungeons, k, 0, visited);
        return answer;
    }

    public static void success(int[][] dungeons, int k, int cnt, boolean[] visited) {
        for (int i = 0; i < dungeons.length; i++) {
            if (k >= dungeons[i][0] && !visited[i]) {
                visited[i] = true;
                success(dungeons, k - dungeons[i][1], cnt + 1, visited);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, cnt);
    }
}
