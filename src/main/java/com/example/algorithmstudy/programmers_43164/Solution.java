package com.example.algorithmstudy.programmers_43164;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    static List<String> list;
    static boolean[] visited;

    public String[] solution(String[][] tickets) {
        String[] answer = {};
        list = new ArrayList<>();
        visited = new boolean[tickets.length];
        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(list);
        answer = list.get(0).split(" ");
        return answer;
    }

    public void dfs(int cnt, String start, String path, String[][] tickets) {
        if (cnt == tickets.length) {
            list.add(path);
            return;
        }

        StringBuilder sb = new StringBuilder(path);
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(start) && !visited[i]) {
                visited[i] = true;
                sb.append(" ").append(tickets[i][1]);
                dfs(cnt + 1, tickets[i][1], sb.toString(), tickets);
                sb.setLength(path.length());
                visited[i] = false;
            }
        }
    }
}