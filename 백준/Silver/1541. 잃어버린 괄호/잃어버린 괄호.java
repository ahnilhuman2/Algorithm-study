import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long res = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        while (st.hasMoreTokens()) {
            int tmp = 0;
            StringTokenizer str = new StringTokenizer(st.nextToken(), "+");

            while (str.hasMoreTokens()) {
                tmp += Integer.parseInt(str.nextToken());
            }

            if (res == Integer.MAX_VALUE)
                res = tmp;
            else
                res -= tmp;
        }
        sb.append(res);
        System.out.println(sb);
    }
}