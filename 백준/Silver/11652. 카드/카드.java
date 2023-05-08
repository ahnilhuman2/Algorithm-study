import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        ArrayList<Long> list = new ArrayList<>();
        Long answer = Long.valueOf(0);

        for (int i = 0; i < case1; i++) {
            Long card = Long.parseLong(br.readLine());
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        for (Long n : map.keySet()) {
            list.add(n);
        }
        Collections.sort(list);

        int max = 0;

        for (Long n : list) {
            if (map.get(n) > max) {
                max = map.get(n);
                answer = n;
            }
        }
        sb.append(answer);
        System.out.println(sb);

    }
}