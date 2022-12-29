package com.example.algorithmstudy.baekjoon_7_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int count = 1, sum = 0;

        while (true) {
            if (a <= sum + count) {

                if (count % 2 == 1) {	// 대각선의 개수가 홀수라면
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상 내의 블럭 개수 - (a 번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모는 a 번째 - 직전 대각선까지의 블럭 개수
                    System.out.print((count - (a - sum - 1)) + "/" + (a - sum));
                    break;
                }

                else {	// 대각선상의 블럭의 개수가 짝수라면
                    // 홀수일 때의 출력을 반대로
                    System.out.print((a - sum) + "/" + (count - (a - sum - 1)));
                    break;
                }

            } else {
                sum += count;
                count++;
            }
        }
    }
}
