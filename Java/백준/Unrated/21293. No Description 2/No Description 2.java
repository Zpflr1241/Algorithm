import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split(" ");
        int a = Integer.parseInt(arr[24]);
        int b = Integer.parseInt(arr[23]);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a+b+1);
    }
}