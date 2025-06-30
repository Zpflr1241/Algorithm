import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char name;
        int[] abc = new int[26];
        int n = Integer.parseInt(bf.readLine());
        boolean print = false;
        for (int i = 0; i < n; i++) {
            name = bf.readLine().charAt(0);
            abc[(int)name-97]++;
        }
        for (int i = 0; i < abc.length; i++) {
            if(abc[i] >= 5){
                System.out.print((char)(i+97));
                print = true;
            }
        }
        if(!print)
            System.out.println("PREDAJA");
    }
}