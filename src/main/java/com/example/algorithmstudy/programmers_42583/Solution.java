package com.example.algorithmstudy.programmers_42583;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        int sum = 0;

        for (int tw : truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.offer(tw);
                    sum += tw;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    if (sum + tw > weight) {
                        queue.offer(0);
                        answer++;
                    } else {
                        queue.offer(tw);
                        sum += tw;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}
