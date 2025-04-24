import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        double a = 1.0;

        if(s.length == 1){
            System.out.println(0.0);
        }
        else {
            switch (s[0]) {
                case "A":
                    a = 4.0;
                    break;
                case "B":
                    a = 3.0;
                    break;
                case "C":
                    a = 2.0;
                    break;
            }
            if (s[1].equals("+"))
                System.out.println(a+0.3);
            else if (s[1].equals("-"))
                System.out.println(a-0.3);
            else
                System.out.println(a);
        }
    }
}