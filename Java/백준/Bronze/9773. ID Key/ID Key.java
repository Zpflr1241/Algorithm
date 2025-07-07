import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split("");
            int res = 0;
            for (int j = 0; j < arr.length; j++) {
                res += Integer.parseInt(arr[j]);
            }
            res += Integer.parseInt(arr[10]+arr[11]+arr[12]) * 10;
            if(res < 1000){
                System.out.println(res+1000);
            }
            else if(res >= 10000){
                System.out.printf("%04d\n",res%10000);
            }
            else{
                System.out.println(res);
            }
        }
    }
}