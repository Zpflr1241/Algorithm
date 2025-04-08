import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int res = -50;
        
        if(a <= b && a <= c) res += a;
        else if(b <= a && b <= c) res += b;
        else res += c;
        
        if(d >= e) res += e;
        else res += d;
        System.out.println(res);
    }
}