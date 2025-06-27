import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int A = sc.nextInt();

        if(L > R){
            while(L > R && A > 0) {
                R++;
                A--;
            }
        }
        else{
            while(R > L && A > 0) {
                L++;
                A--;
            }
        }
        if(L == R) System.out.println(L+R+A-(A%2));
        else System.out.println(L+R-Math.abs(L-R)+A-(A%2));
    }
}