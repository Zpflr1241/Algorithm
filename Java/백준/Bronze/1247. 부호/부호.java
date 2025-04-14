import java.io.*;
import java.math.BigInteger;

public class Main {
    // 1247 부호
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            BigInteger big = new BigInteger("0");
            int T = Integer.parseInt(bf.readLine());

            for (int j = 0; j < T; j++) {
                big = big.add(BigInteger.valueOf(Long.parseLong(bf.readLine())));
            }

            int comp = big.compareTo(BigInteger.valueOf(0));

            if (comp == 0) {
                bw.write(0+"\n");
            }
            else if(comp == 1){
                bw.write("+\n");
            }
            else
                bw.write("-\n");
        }
        bw.close();
    }
}