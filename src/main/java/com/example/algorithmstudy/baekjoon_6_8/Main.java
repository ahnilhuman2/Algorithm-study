package com.example.algorithmstudy.baekjoon_6_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = new char[s.length()];
//        char[] ch2 = sc.nextLine().toCharArray();
        int time = 0;

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);

            switch (ch[i]) {
                case '1':
                    time += 2;
                    break;
                case 'A':
                case 'B':
                case 'C':
                    time += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    time += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    time += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    time += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    time += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    time += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    time += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    time += 10;
                    break;
            }
        }
        System.out.println(time);
    }
}
