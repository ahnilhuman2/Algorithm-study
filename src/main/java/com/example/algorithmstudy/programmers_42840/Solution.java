package com.example.algorithmstudy.programmers_42840;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int[] solution(int[] answers) {
        HashMap<String, Integer> map = new HashMap<>();
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                map.put("1", map.getOrDefault("1", 0) + 1);
            }
            if (answers[i] == student2[i % student2.length]) {
                map.put("2", map.getOrDefault("2", 0) + 1);
            }
            if (answers[i] == student3[i % student3.length]) {
                map.put("3", map.getOrDefault("3", 0) + 1);
            }
        }

        int max = 0;
        for (String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(Integer.parseInt(key));
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
