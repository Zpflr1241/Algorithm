import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 34073 DORO
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine()); // useless
        String[] arr = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : arr){
            sb.append(word).append("DORO ");
        }
        System.out.println(sb.toString());
    }
}