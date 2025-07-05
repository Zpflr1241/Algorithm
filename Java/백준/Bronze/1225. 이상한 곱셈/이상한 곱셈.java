import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A;
        int[] B;
        String input1 = sc.next();
        if(input1.equals("0")){
            System.out.println(0);
            return;
        }
        String input2 = sc.next();
        A = new int[input1.length()];
        B = new int[input2.length()];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(input1.charAt(i)+"");
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(input2.charAt(i)+"");
        }
        long res = 0;
        for (int a : A) {
            for (int b : B) {
                res += (long) a*b;
            }
        }
        System.out.println(res);

    }
}