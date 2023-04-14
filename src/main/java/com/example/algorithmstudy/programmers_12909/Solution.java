package com.example.algorithmstudy.programmers_12909;

import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                } else {
                    stack.pop();
                }
            }
        }
        return answer && stack.isEmpty();
    }
}