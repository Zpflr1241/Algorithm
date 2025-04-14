import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n/3+1; j++) {
                if(i + 3*j == n) res = i+j;
                else if(i+ 3*j > n) break;
            }
        }
        if(res==1){
            System.out.println("SK");
        }
        else if(res%2==0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}