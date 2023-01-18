import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int res1 = 1;
        int res2 = 1;

        for (int i = a; i > a - b ; i--) {
            res1 *= i;
        }

        for (int i = 1; i <= b ; i++) {
            res2 *= i;
        }

        sb.append(res1 / res2);
        System.out.println(sb);
    }
}
