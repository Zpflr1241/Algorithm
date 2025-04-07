import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int tmp;
        if (N == 1) {
            tmp = 0;
        }
        else {
            tmp = (N - 2) / 6 + 1;
            for (int i = 1; ; i++) {
                if (i * (i + 1) / 2 >= tmp) {
                    tmp = i;
                    break;
                }
            }
        }
        System.out.println(tmp+1);
    }
}