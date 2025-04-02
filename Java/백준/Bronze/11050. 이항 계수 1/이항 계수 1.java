import java.util.Scanner;

public class Main {
    static int febo(int num){
        int tmp = 1;
        for(int i = 2; i <= num; i++){
            tmp *= i;
        }
        return tmp;
    }
    public static void main(String[] args) {
        // 이항 계수 1
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(febo(N) / (febo(K) * febo(N-K)));

    }

}