package com.example.algorithmstudy.baekjoon_16165;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, ArrayList<String>> girlGroup = new HashMap<>();
        HashMap<String, String> searchMember = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String group = br.readLine();
            int memberNum = Integer.parseInt(br.readLine());

            ArrayList<String> members = new ArrayList<>();

            for (int j = 0; j < memberNum; j++) {
                String member = br.readLine();
                members.add(member);
                searchMember.put(member, group);
            }

            Collections.sort(members);
            girlGroup.put(group, members);
        }

        for (int i = 0; i < M; i++) {
            String ques = br.readLine();
            int type = Integer.parseInt(br.readLine());

            if (type == 0) {
                ArrayList<String> members = girlGroup.get(ques);
                for (String member : members) {
                    sb.append(member).append('\n');
                }
            } else if (type == 1) {
                String group = searchMember.get(ques);
                sb.append(group).append('\n');
            }
        }

        System.out.print(sb);
    }
}
