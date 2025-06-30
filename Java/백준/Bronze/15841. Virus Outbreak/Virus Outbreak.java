import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger[] fibo = new BigInteger[491];
        fibo[0] = BigInteger.ZERO;
        fibo[1] = BigInteger.ONE;
        while(true){
            int input = Integer.parseInt(bf.readLine());
            if(input == -1) break;
            if(fibo[input] != null)
                System.out.println("Hour "+input+": "+fibo[input]+" cow(s) affected");
            else {
                for (int i = 2; i <= input; i++) {
                    fibo[i] = fibo[i - 1].add(fibo[i - 2]);
                }
                System.out.println("Hour "+input+": "+fibo[input]+" cow(s) affected");
            }
        }

    }
}