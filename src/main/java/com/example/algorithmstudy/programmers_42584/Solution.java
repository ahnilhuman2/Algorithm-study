package com.example.algorithmstudy.programmers_42584;

import java.util.*;

public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();

        for (int price : prices) {
            queue.offer(price);
        }

        for (int i = 0; i < prices.length; i++) {
            int cnt = 0;
            int currPrice = queue.poll();
            for (int p : queue) {
                cnt++;
                if (currPrice > p) {
                    break;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
