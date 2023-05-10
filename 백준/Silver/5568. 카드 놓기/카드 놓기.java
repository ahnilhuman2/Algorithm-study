import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    static int[] cardList;
    static int[] choice;
    static int N;
    static int K;
    static HashSet<Integer> set = new HashSet<>();
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        cardList = new int[N];
        choice = new int[K];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            cardList[i] = Integer.parseInt(br.readLine());
        }

        dfs(0);
        System.out.println(set.size());
    }

    public static void dfs(int depth) {
        if (depth == K) {
            sb = new StringBuilder();
            for (int i = 0; i < K; i++) {
                sb.append(choice[i]);
            }
            set.add(Integer.parseInt(sb.toString()));
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                choice[depth] = cardList[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
