import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        int[] arr = new int[case1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < case1; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        int mo = 0;
        int ja = 0;

        for (int i = 1; i < arr.length; i++) {
            mo = arr[0] / gcd(arr[0], arr[i]);
            ja = arr[i] / gcd(arr[0], arr[i]);

            sb.append(mo).append("/").append(ja).append("\n");
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}