import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.next().split("");
        if(A[0].equals("0")) System.out.println(0);
        else {
            String[] B = sc.next().split("");
            long res = 0;
            for (String a : A) {
                for (String b : B) {
                    res += (long) Integer.parseInt(a) * Integer.parseInt(b);
                }
            }
            System.out.println(res);
        }
    }
}