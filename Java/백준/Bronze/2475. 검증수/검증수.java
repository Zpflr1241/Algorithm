import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)Math.pow(sc.nextInt(),2);
        int b = (int)Math.pow(sc.nextInt(),2);
        int c = (int)Math.pow(sc.nextInt(),2);
        int d = (int)Math.pow(sc.nextInt(),2);
        int e = (int)Math.pow(sc.nextInt(),2);
        System.out.println((a+b+c+d+e)%10);
    }
}