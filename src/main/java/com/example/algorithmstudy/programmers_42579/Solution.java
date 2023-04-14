package com.example.algorithmstudy.programmers_42579;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        ArrayList<String> genreKey = new ArrayList<>();
        for (String key : map.keySet()) {
            genreKey.add(key);
        }
        Collections.sort(genreKey, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < genreKey.size(); i++) {
            String g = genreKey.get(i);
            int max = 0;
            int firstidx = 0;

            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j])) {
                    if (max < plays[j]) {
                        max = plays[j];
                        firstidx = j;
                    }
                }
            }

            max = 0;
            int secondidx = 0;

            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j])) {
                    if (max < plays[j] && firstidx != j) {
                        max = plays[j];
                        secondidx = j;
                    }
                }
            }

            list.add(firstidx);
            if (max != 0) {
                list.add(secondidx);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
