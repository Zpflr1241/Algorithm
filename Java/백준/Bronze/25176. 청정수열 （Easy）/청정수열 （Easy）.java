import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = N;
        for (int i = 1; i < N; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
