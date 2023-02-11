import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        sb.append(isRight(N, 0));
        System.out.println(sb);
    }

    public static int isRight(int N, int cnt) {

        if (N < 2) {
            return cnt;
        }
        return Math.min(isRight(N / 2, cnt + 1 + (N % 2)), isRight(N / 3, cnt + 1 + (N % 3)));
    }
}