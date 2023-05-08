package com.example.algorithmstudy.programmers_42627;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, Comparator.comparingInt(a -> {
            return a[0];
        }));

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int cnt = 0;
        int index = 0;
        int totalTime = 0;
        int end = 0;

        while (cnt < jobs.length) {
            while (index < jobs.length && jobs[index][0] <= end) {
                queue.offer(jobs[index++]);
            }

            if (queue.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] job = queue.poll();
                totalTime += job[1] + end - job[0];
                end += job[1];
                cnt++;
            }
        }

        answer = totalTime / jobs.length;

        return answer;
    }
}
