import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //편법
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int res = n-n%100;
        String str = Integer.toString(res);
        if(res%f == 0){
            System.out.println(str.substring(str.length()-2));
        } else {
            res = res + (f - res % f);
            str = Integer.toString(res);
            System.out.println(str.substring(str.length() - 2));
        }
    }
}