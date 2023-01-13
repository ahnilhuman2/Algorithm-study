import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cham = Integer.parseInt(br.readLine());

        int[] arr = new int[6];

        StringTokenizer st;

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int area = 0;
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i] * arr[i == 5? 0 : i + 1];
            if (area < tmp) {
                area = tmp;
            }
            maxArea += tmp;
        }
        System.out.println((maxArea - area*2) * cham);
    }
}