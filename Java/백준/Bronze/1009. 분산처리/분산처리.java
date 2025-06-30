import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int a,b;
        int res;
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            res = a;
            for (int j = 0; j < b-1; j++) {
                res *= a;
                res %= 10;
                if(res == 0) res = 10;
            }
            if(b == 1) {
                System.out.println((res % 10 == 0) ? 10 : res % 10);
            }else{
                System.out.println(res);
            }
        }
    }
}