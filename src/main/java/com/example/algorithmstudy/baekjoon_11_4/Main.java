package com.example.algorithmstudy.baekjoon_11_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] A, tmp;
    static int cnt = 0;
    static int result = -1;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int case1 = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        A = new int[case1];
        for(int i = 0; i < case1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        tmp = new int[case1];
        merge_sort(A, 0, case1 - 1);
        sb.append(result);
        System.out.println(sb);

    }

    public static void merge_sort(int[] A, int p, int r) {
        if (cnt > K) return ;
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if(A[i] <= A[j]) {
                tmp[t] = A[i];
                i++;
            }else {
                tmp[t] = A[j];
                j++;
            }
            t++;
        }

        while (i <= q)
            tmp[t++] = A[i++];

        while (j <= r)
            tmp[t++] = A[j++];

        i = p;
        t = 0;
        while (i <= r) {
            cnt++;
            if (cnt == K) {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }

}