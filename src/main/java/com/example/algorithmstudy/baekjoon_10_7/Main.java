package com.example.algorithmstudy.baekjoon_10_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split("");
        Integer[] arr = new Integer[a.length];

        for (int i = 0; i < a.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }
    }
}
