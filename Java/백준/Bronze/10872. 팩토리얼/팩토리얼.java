import java.util.Scanner;

public class Main {

    static int fibo(int n){
        if(n < 1) return 1;
        return n * fibo(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibo(a));
    }
}