package com.example.algorithmstudy.programmers_12906;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        int tmp  = -1;

        for (int a : arr) {
            if (tmp != a) {
                queue.add(a);
                tmp = a;
            }
        }
        return queue.stream().mapToInt(i -> i).toArray();
    }
}
