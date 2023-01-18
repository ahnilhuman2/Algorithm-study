import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        int[] arr = new int[case1];
        for (int i = 0; i < case1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int gcdValue = arr[1] - arr[0];

        for(int i = 2; i < case1; i++) {
            gcdValue = gcd(gcdValue, arr[i] - arr[i - 1]);
        }

        for(int i = 2; i <= gcdValue / 2; i++) {
            if(gcdValue % i == 0) {
                sb.append(i + " ");
            }
        }
        sb.append(gcdValue);
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
