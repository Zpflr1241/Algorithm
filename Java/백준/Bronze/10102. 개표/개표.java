import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.nextLine());
        String arr = sc.nextLine();
        int A = 0;
        int B = 0;
        for (String s : arr.split("")) {
            if(s.equals("A")) A++;
            else if(s.equals("B")) B++;
        }
        if(A > B) System.out.println("A");
        else if(B > A) System.out.println("B");
        else System.out.println("Tie");
    }
}