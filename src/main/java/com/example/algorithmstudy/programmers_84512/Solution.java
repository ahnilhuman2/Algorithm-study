package com.example.algorithmstudy.programmers_84512;

public class Solution {

    static String[] arr = {"A", "E", "I", "O", "U"};
    static int cnt;
    static int answer;

    public int solution(String word) {
        dfs("", word);
        return answer;
    }

    public void dfs(String str, String word) {
        if (str.length() == 5) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            String tmp = str + arr[i];
            cnt++;

            if (tmp.equals(word)) {
                answer = cnt;
                return;
            }
            dfs(tmp, word);
        }
    }
}
