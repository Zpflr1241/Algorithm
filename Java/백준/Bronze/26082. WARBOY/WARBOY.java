import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        A = sc.nextInt()/A;
        int b = sc.nextInt();
        System.out.println(A*3*b);
    }
}