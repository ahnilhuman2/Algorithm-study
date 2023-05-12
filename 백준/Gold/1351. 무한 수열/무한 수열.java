import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static HashMap<Long, Long> map = new HashMap<>();
    static long P;
    static long Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        P = Long.parseLong(st.nextToken());
        Q = Long.parseLong(st.nextToken());

        sb.append(func(N));
        System.out.println(sb);

    }
    public static long func(long n) {
        if (n == 0) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }

        long ap = Math.abs(n / P);
        long aq = Math.abs(n / Q);

        map.put(n, func(ap) + func(aq));
        return map.get(n);
    }
}
