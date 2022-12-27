package com.example.algorithmstudy.baekjoon_6_5;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase(Locale.ROOT);
        Map<String, Integer> map = new HashMap<>();
        String[] s = str.split("");
        
        for (String a : s) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        int max = 0;
        boolean flag = false;
        String res = null;
        
        for (String a : map.keySet()) {
            if (map.get(a) > max) {
                max = map.get(a);
                flag = false;
                res = a;
            }else if (map.get(a) == max) {
                flag = true;
            }
        }
        if (flag ==  false) {
            System.out.println(res);
        }else {
            System.out.println("?");
        }
    }
}
