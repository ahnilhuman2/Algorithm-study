import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int case1 = Integer.parseInt(br.readLine());
        int[] arr = new int[case1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < case1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = arr[0] * arr[case1 - 1];

        System.out.println(result);
    }
}