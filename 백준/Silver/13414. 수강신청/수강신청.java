import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < L; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                set.remove(str);
            }
            set.add(str);
        }

        for (String str : set) {
            sb.append(str).append("\n");
            K--;
            if (K == 0) {
                break;
            }
        }
        System.out.println(sb);
    }
}