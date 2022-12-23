package com.example.algorithmstudy.baekjoon_5_2;

public class Main {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for (int i = 1; i < arr.length; i++) {
            int a = selfNumber(i);
            if (a < 10001) {
                arr[a] = true;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }
    }
    public static int selfNumber(int a) {
        int sum = a;
        while (a != 0) {
            sum += a%10;
            a = a/10;
        }
        return sum;
    }
}
