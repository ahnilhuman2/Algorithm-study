package com.example.algorithmstudy.programmers_43163;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    int answer = 0;
    static boolean[] visited;

    private class Node {
        String word;
        int count;

        public Node(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        bfs(begin, target, words);

        return answer;
    }

    public void bfs(String begin, String target, String[] words) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(begin, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.word.equals(target)) {
                answer = node.count;
                break;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && isValid(node.word, words[i])) {
                    visited[i] = true;
                    queue.add(new Node(words[i], node.count + 1));
                }
            }
        }
    }

    private boolean isValid(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}
