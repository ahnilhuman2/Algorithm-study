import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        dp = new long[101];
        dp[1] = dp[2] = dp[3] = 1L;
        dp[4] = dp[5] = 2L;

        for (int i = 0; i < case1; i++) {
            int a = Integer.parseInt(br.readLine());
            sb.append(triangle(a)).append("\n");
        }
        System.out.println(sb);
    }

    public static long triangle(int a) {
        if (dp[a] != 0) return dp[a];
        return dp[a] = triangle(a - 1) + triangle(a - 5);
    }
}