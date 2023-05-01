package com.example.algorithmstudy.programmers_42626;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int lowest;
        int nextLowest;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int s : scoville) {
            queue.offer(s);
        }

        while (queue.peek() < K) {
            if (queue.size() == 1) return -1;
            lowest = queue.poll();
            nextLowest = queue.poll();
            queue.offer(lowest + (nextLowest * 2));
            answer++;
        }

        return answer;
    }
}
