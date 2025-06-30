import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long fibo[] = new long[46];
        fibo[0] = 0;
        fibo[1] = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i-1]+fibo[i-2];
        }
        System.out.println(fibo[n]);
    }
}