import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(sc.nextLine());
        int temp = time + H*3600 + M*60 + S;
        H = (temp/3600)%24;
        M = (temp/60)%60;
        S = temp%60;
        System.out.println(H+" "+M+" "+S);
    }
}