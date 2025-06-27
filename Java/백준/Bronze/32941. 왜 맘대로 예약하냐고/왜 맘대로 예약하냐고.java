import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int T = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(bf.readLine());
        boolean can = true;
        for (int i = 0; i < N; i++) {
            boolean bool = false;
            int K = Integer.parseInt(bf.readLine());
            String arr = bf.readLine();
            for (String s : arr.split(" ")){
                int temp = Integer.parseInt(s);

                if(temp == X){
                    bool = true;
                    break;
                }
            }
            if(!bool){
                can = false;
                System.out.println("NO");
                break;
            }
        }
        if(can){
            System.out.println("YES");
        }

    }
}