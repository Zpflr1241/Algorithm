import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            long fibo[] = new long[46];
            fibo[0] = 1;
            fibo[1] = 1;
            int n = sc.nextInt();

            for (int j = 2; j <= n; j++) {
                fibo[j] = fibo[j-1]+fibo[j-2];
            }
            System.out.println(fibo[n]);
        }
    }
}