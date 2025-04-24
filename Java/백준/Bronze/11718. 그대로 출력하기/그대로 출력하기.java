import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        try {
            for (;;) {
                sb.append(sc.nextLine()+"\n");
            }
        } catch (Exception e) {
            System.out.println(sb);
        }
    }
}