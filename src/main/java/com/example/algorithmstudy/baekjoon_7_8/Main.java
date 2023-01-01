package com.example.algorithmstudy.baekjoon_7_8;

import java.math.BigInteger;
import java.util.Scanner;
// Big Int
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        A = A.add(b);


        System.out.println(A);
    }
}
