package com.example.algorithmstudy.baekjoon_6_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int cnt = a;

        for (int i = 0; i < a; i++) {
            String[] ss = sc.nextLine().split("");
            Set<String> set = new HashSet<>();
            set.add(ss[0]);

            for (int j = 1; j < ss.length; j++) {
                if (!ss[j].equals(ss[j-1])) {
                    if (set.contains(ss[j])) {
                        cnt--;
                        break;
                    }else {
                        set.add(ss[j]);
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
