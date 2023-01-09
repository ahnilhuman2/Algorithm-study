package com.example.algorithmstudy.baekjoon_10_12;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());


        int[] arr = new int[case1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < case1; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        int[] arr2 = Arrays.stream(arr)
                .distinct()
                .sorted()
                .toArray();

//        Arrays.sort(arr2);

        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

//        Arrays.stream(arr)
//                .filter(a -> map.put(arr.indexOf(a), a)
//                .map(s -> map.keySet(s))
//                .forEach(System.out::println);
//

        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);

    }
}
