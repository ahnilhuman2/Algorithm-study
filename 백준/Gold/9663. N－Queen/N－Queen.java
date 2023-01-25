import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int num;
    public static int[] arr;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        arr = new int[num];
        queen(0);

        System.out.println(cnt);
    }
    
    public static boolean possible(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            }else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static void queen(int depth) {
        if (depth == num) {
            cnt++;
            return;
        }
        for (int i = 0; i < num; i++) {
            arr[depth] = i;
            if (possible(depth)) {
                queen(depth + 1);
            }
        }
    }
}
