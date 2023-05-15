import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < case1; i++) {
            set.add(br.readLine());
        }

        for (String str : set) {
            String str2 = new StringBuilder(str).reverse().toString();
            if (set.contains(str2)) {
                sb.append(str.length()).append(" ").append(str.charAt(str.length() / 2));
                break;
            }
        }
        System.out.println(sb);
    }
}
