import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Float> map = new HashMap<>();
        int cnt = 0;

        while (true) {
            String end = br.readLine();
            if (end == null || end.length() == 0) {
                break;
            }
            map.put(end, map.getOrDefault(end, 0f) + 1);
            cnt++;
        }

        String[] arr = map.keySet().toArray(new String[0]);
        Arrays.sort(arr);

        for (String str : arr) {
            sb.append(str + " " + String.format("%.4f", map.get(str) / cnt * 100) + "\n");
        }
        System.out.println(sb);
    }
}
