import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.length() < K) {
                continue;
            }
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        map.entrySet().stream()
                .sorted(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                        if (e1.getValue() == e2.getValue()) {
                            if (e1.getKey().length() == e2.getKey().length()) {
                                return e1.getKey().compareTo(e2.getKey());
                            }
                            return e2.getKey().length() - e1.getKey().length();
                        }
                        return e2.getValue() - e1.getValue();
                    }
                })
                .forEach(e -> sb.append(e.getKey()).append("\n"));

        System.out.println(sb);
    }
}
