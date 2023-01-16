import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int case1 = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < case1; i++) {
            st =  new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int case2 = Integer.parseInt(br.readLine());
            int res = 0;

            for (int j = 0; j < case2; j++) {
                st =  new StringTokenizer(br.readLine());
                int c1 = Integer.parseInt(st.nextToken());
                int c2 = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                boolean flag1 = false;
                boolean flag2 = false;

                if (Math.pow(x1 - c1, 2) + Math.pow(y1 - c2, 2) > Math.pow(r, 2)) {
                    flag1 = true;
                }
                if (Math.pow(x2 - c1, 2) + Math.pow(y2 - c2, 2) > Math.pow(r, 2)) {
                    flag2 = true;
                }

                if (flag1 != flag2) {
                    res++;
                }

            }
            System.out.println(res);
        }
    }
}
