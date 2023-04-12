package com.example.algorithmstudy.programmers_42577;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> map = new HashMap<>();

        for (String phone : phone_book) {
            map.put(phone, 0);
        }

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (map.containsKey(phone.substring(0, i))) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}
