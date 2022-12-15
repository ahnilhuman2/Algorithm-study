package com.example.algorithmstudy.q01해시01;

import java.util.HashMap;

/*
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 */
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";

        for (String a : participant) {
            if (map.get(a) ==  null) {
                map.put(a, 1);
            }else {
                map.put(a, map.get(a) + 1);
            }
        }

        for (String a : completion) {
            map.put(a, map.get(a) - 1);
            if (map.get(a) == 0) {
                map.remove(a);
            }
        }
        // set은 순서가 없는 배열
        // keySet() : map에 있는 key값을 배열로 만들어주는 값 (문제에서는 key를 String으로 만들어줬으니 배열이 String으로 나옴)
        for (String a : map.keySet()) {
            answer = a;
        }

        return answer;
    }
}
