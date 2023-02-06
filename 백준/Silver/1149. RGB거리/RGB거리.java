import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int dp[][];
    public static int cost[][];

    public static final int red = 0;
    public static final int green = 1;
    public static final int blue = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        StringTokenizer st;

        dp = new int[case1][3];
        cost = new int[case1][3];

        for (int i = 0; i < case1; i++) {
            st = new StringTokenizer(br.readLine());
            cost[i][red] = Integer.parseInt(st.nextToken());
            cost[i][green] = Integer.parseInt(st.nextToken());
            cost[i][blue] = Integer.parseInt(st.nextToken());
        }

        dp[0][red] = cost[0][red];
        dp[0][green] = cost[0][green];
        dp[0][blue] = cost[0][blue];

        sb.append(Math.min(minCost(case1 - 1, red), Math.min(minCost(case1 - 1, green), minCost(case1 - 1, blue))));
        System.out.println(sb);

    }

    public static int minCost(int case1, int color) {

        if(dp[case1][color] == 0) {
            if(color == red) {
                dp[case1][red] = Math.min(minCost(case1 - 1, green), minCost(case1 - 1, blue)) + cost[case1][red];
            }
            else if(color == green) {
                dp[case1][green] = Math.min(minCost(case1 - 1, red), minCost(case1 - 1, blue)) + cost[case1][green];
            }
            else {
                dp[case1][blue] = Math.min(minCost(case1 - 1, red), minCost(case1 - 1, green)) + cost[case1][blue];
            }
        }
        return dp[case1][color];
    }
}