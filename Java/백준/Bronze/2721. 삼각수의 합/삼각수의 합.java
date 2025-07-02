import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(bf.readLine());
            int res = 0;
            for (int k = 1; k <= n; k++) {
                res += k*(k+1)*(k+2)/2;
            }
            System.out.println(res);
        }
    }
}