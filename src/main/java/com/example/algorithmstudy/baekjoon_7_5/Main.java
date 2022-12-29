package com.example.algorithmstudy.baekjoon_7_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
/*    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int case1 = Integer.parseInt(br.readLine());

        for (int i = 0; i < case1; i++) {
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int roomNum =  c%a; // 층
            int roomHo = c/a;

//            if (roomHo > b)
            System.out.println(roomNum);
            System.out.println(roomHo);
        }




    }*/

/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int case1 = sc.nextInt();

        for (int i = 0; i < case1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int roomNum =  c%a; // 층
            int roomHo = c/a + 1;

            System.out.printf("%d%02d\n", roomNum,roomHo);
            System.out.println();
        }
    }*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int case1 = sc.nextInt();

        for (int i = 0; i < case1; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (c % a == 0) {
                System.out.println((a * 100) + (c / a));
            } else {
                System.out.println(((c % a) * 100) + ((c / a) + 1));
            }
        }
    }
}
