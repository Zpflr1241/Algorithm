import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String a = sc.nextLine();
            a = a.charAt(0)+""+a.charAt(a.length()-1)+"";
            System.out.println(a);
        }
    }
}