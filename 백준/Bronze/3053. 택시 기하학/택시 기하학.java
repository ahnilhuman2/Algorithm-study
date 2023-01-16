import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double r = Integer.parseInt(br.readLine());

        double wight = r * r * Math.PI;
        double twight = Math.sqrt((r * r) + (r * r));

        System.out.printf("%.6f%n%.6f", wight, twight*twight);

    }
}