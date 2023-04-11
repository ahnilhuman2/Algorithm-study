package com.example.algorithmstudy.baekjoon_10_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int case1 = Integer.parseInt(br.readLine());
//
//        int[][] arr = new int[case1][2];
//
//
//        for (int i = 0; i < case1; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//
//            arr[i][0] = x;
//            arr[i][1] = y;
//        }
//
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] == o2[0]) {
//                    return o1[1] - o2[1];
//                }else {
//                    return o1[0] - o2[0];
//                }
//            }
//        });
//
//        for (int i = 0; i < case1; i++) {
//            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
//        }
//
//        System.out.println(sb);
//    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);


        set.stream()
                .filter(integer -> integer % 2 == 0)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 == 0;
                    }
                })
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                })
                .sorted((o1, o2) -> o1 - o2)
                .map(new Function<Integer, String>() {
                    @Override
                    public String apply(Integer integer) {
                        return "string: " + integer;
                    }
                })
                .map(s -> "String" + s)
                .forEach(System.out::println);
//                .forEach(s -> System.out.println(s));



        Map.of(1, "1임", 2, "2임").keySet().stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 == 0;
                    }
                }).forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });



        Test a = (Integer t) -> false;
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "일");
        map.put(2, "이");
        map.put(3, "삼");
        map.put(4, "사");

        map.keySet().stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 == 0;
                    }
                })
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                })
                .forEach(System.out::println);
        // Supplier, Function, Runnable, Predicate, Consumer
        // Comparable, Comparator
        Set.of(1, 2, 3, 4).stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);

        int[] arr = new int[]{1, 2, 3, 1, 2, 3};

        Arrays.stream(arr).boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    @FunctionalInterface
    interface Test {
        boolean test(Integer t);
    }
}
