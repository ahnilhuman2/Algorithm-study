package com.example.algorithmstudy.baekjoon_3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int variety = sc.nextInt();
        int result = 0;

        for (int i = 0; i < variety; i++) {
            int price =  sc.nextInt();
            int num =  sc.nextInt();

            result +=  price * num;
        }


        if (result == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}