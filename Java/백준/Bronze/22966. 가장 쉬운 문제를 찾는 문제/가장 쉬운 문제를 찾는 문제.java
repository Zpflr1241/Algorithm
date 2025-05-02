import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        String res = st.nextToken();
        int ans = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N-1; i++) {
            StringTokenizer st2 = new StringTokenizer(sc.nextLine());
            String stemp = st2.nextToken();
            int temp = Integer.parseInt(st2.nextToken());
            if(temp < ans){
                ans = temp;
                res = stemp;
            }
        }
        System.out.println(res);
    }
}