package com.example.algorithmstudy.level0_10;

// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

public class solution {
    public double solution(int[] numbers) {

        int sum = 0;
        double avg = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        avg = (double) sum/ numbers.length;

        return avg;
    }
}