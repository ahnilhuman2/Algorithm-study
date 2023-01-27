import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int case1;
    public static int[][] arr;
    public static boolean[] visit;

    public static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        case1 = Integer.parseInt(br.readLine());

        arr = new int[case1][case1];
        visit = new boolean[case1];

        for (int i = 0; i < case1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < case1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(MIN);
    }

    public static void dfs(int idx, int depth) {

        if(depth == case1 / 2) {
            diff();
            return;
        }

        for(int i = idx; i < case1; i++) {

            if(!visit[i]) {
                visit[i] = true;
                dfs(i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }

    static void diff() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < case1 - 1; i++) {
            for (int j = i + 1; j < case1; j++) {
                if (visit[i] == true && visit[j] == true) {
                    team_start += arr[i][j];
                    team_start += arr[j][i];
                } else if (visit[i] == false && visit[j] == false) {
                    team_link += arr[i][j];
                    team_link += arr[j][i];
                }
            }
        }

        int value = Math.abs(team_start - team_link);

        if (value == 0) {
            System.out.println(value);
            System.exit(0);
        }

        MIN = Math.min(value, MIN);

    }
}
