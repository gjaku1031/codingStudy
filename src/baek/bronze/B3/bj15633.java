package baek.bronze.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj15633 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum * 5 - 24);
    }
}
