import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 9){
            System.out.println(0);
            return;
        }
        int cnt = 0;
        for (int i = 3; i <= n-6; i += 3) {
            for (int j = 3; j <= n-6; j += 3) {
                if(n <= i+j) break;
                for (int k = 3; k <= n-6; k += 3) {
                    if(n < i+j+k) break;
                    if(n == i + j + k) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}