import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 34073 DORO
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split("_");
        int underBar = arr.length-1;
        int sum = underBar;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].length();
        }
        System.out.println(sum+underBar*5+2);
    }
}