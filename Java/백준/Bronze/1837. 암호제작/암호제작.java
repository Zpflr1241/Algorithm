import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    // 1837 암호제작
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(bf.readLine());

        BigInteger P = new BigInteger(st.nextToken()); // 암호
        int k = Integer.parseInt(st.nextToken());
        sb.append("GOOD");

        for (int i = 2; i < k; i++) {
            if (P.mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0){
                sb.delete(0,4);
                sb.append("BAD ").append(i);
                break;
            }
        }
        System.out.println(sb);
    }
}