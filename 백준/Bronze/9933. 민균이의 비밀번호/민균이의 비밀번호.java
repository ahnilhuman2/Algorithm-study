import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int case1 = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < case1; i++) {
            list.add(br.readLine());
        }

        String[] arr = new String[case1];
        String[] arrRe = new String[case1];
        for (int i = 0; i < case1; i++) {
            arr[i] = list.get(i);
        }
        for (int i = 0; i < case1; i++) {
            arrRe[i] = new StringBuilder(arr[i]).reverse().toString();
        }

        for (int i = 0; i < case1; i++) {
            for (int j = 0; j < case1; j++) {
                if (arr[i].equals(arrRe[j])) {
                    sb.append(arr[i].length()).append(" ").append(arr[i].charAt(arr[i].length() / 2));
                    System.out.println(sb);
                    return;
                }
            }
        }
    }
}
