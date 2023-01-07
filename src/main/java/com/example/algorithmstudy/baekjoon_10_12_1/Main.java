package com.example.algorithmstudy.baekjoon_10_12_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();


        for (int i = 0; i < case1; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr1.add(a);
        }
        arr2 = arr1;

        arr1.stream()
                .distinct()
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                })
                .forEach(System.out::println);


//        ArrayList<Integer> resultArr =  arr1.stream().filter(a -> arr2.stream().noneMatch(Predicate.isEqual(a)))
//                .collect(Collectors.toList());
//
//        List<Integer> resultArr1 = arr1.stream()
//                .filter(old -> arr2.stream().noneMatch(Predicate.isEqual(old)))
//                .collect(Collectors.toList());
     }
}
