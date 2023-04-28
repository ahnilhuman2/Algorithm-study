package com.example.algorithmstudy.programmers_86971;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    static int[][] net;

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        net = new int[n + 1][n + 1];

        for (int i = 0; i < wires.length; i++) {
            net[wires[i][0]][wires[i][1]] = 1;
            net[wires[i][1]][wires[i][0]] = 1;
        }

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];

            net[a][b] = 0;
            net[b][a] = 0;

            answer = Math.min(answer, bfs(n, a));

            net[a][b] = 1;
            net[b][a] = 1;
        }


        return answer;
    }

    public static int bfs(int n, int start) {
        boolean visited[] = new boolean[n + 1];
        int cnt = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            visited[node] = true;

            for (int i = 1; i <= n; i++) {
                if (visited[i] || net[node][i] == 0) {
                    continue;
                }

                if (net[node][i] == 1) {
                    cnt++;
                    queue.offer(i);
                }
            }
        }
        return Math.abs(n - (cnt * 2));
    }
}
