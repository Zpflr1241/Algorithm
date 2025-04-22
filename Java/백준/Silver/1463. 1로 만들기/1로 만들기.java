import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static int[] memo = new int[1000001];

    public static void main(String[] args) {
        Arrays.fill(memo, -1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo[0] = memo[1] = 0;

        System.out.println(make1(n));
    }


    static int make1(int n){
        if(memo[n] == -1){
            if(n%6==0){
                memo[n] = Math.min(make1(n / 3),Math.min(make1(n/2),make1(n - 1))) + 1;
            }
            else if (n % 3 == 0) {
                memo[n] = Math.min(make1(n / 3), make1(n - 1)) + 1;
            } else if (n % 2 == 0) {
                memo[n] = Math.min(make1(n / 2), make1(n - 1)) + 1;
            } else {
                memo[n] = make1(n - 1) + 1;
            }
        }
        return memo[n];
    }
}