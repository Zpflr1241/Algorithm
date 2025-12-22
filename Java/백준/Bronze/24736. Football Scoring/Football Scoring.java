import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < 2; i++) {
            score += sc.nextInt() * 6;
            score += sc.nextInt() * 3;
            score += sc.nextInt() * 2;
            score += sc.nextInt() * 1;
            score += sc.nextInt() * 2;
            System.out.print(score + " ");
            score = 0;
        }
    }
}