import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int m = sc.nextInt(); 
        int M = sc.nextInt(); 
        int T = sc.nextInt(); 
        int R = sc.nextInt();
        int bpm = m;
        int time = 0;
        if(bpm+T > M) System.out.println(-1);
        else {
            while (N > 0) {
                if(bpm+T <= M){
                    N--;
                    bpm+=T;
                    time++;
                }
                else{
                    bpm -= R;
                    if(bpm < m) bpm = m;
                    time++;
                }
            }
            System.out.println(time);
        }
    }
}