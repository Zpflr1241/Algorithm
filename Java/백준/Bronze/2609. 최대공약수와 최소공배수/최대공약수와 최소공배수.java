import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0, min = 0;
        if(b > a){
            a += b;
            b = a-b;
            a = a-b;
        }
        for (int i = 1; i <= b; i++) {
            if(a%i == 0 && b%i == 0) min = i;
        }
        for (int i = 1; i <= b; i++) {
            if((a*i)%b == 0)
            {
                max = a*i;
                break;
            }
        }
        System.out.println(min+"\n"+max);
    }
}