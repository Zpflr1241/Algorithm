import java.util.Scanner;

public class Main {
    static long[] fibo = new long[41];
    static long cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo1(n);
        System.out.print(cnt+" ");
        cnt = 0;
        fibo2(n);
        System.out.println(cnt);
    }

    static long fibo1(long n){
        if(n == 1 || n == 2) {
            cnt++;
            return 1;
        }
        else return fibo1(n-1) + fibo1(n-2);
    }

    static long fibo2(long n){
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
            cnt++;
        }
        return fibo[(int)n];
    }
}