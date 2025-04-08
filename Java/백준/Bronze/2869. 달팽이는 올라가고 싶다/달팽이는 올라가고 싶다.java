import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int res = 1;
        int tmp = a-b;
        v -= a;
        res += v/tmp+(v%tmp>0 ? 1 : 0);
        System.out.println(res);
    }
}