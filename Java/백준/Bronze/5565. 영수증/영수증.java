import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < 9; i++) {
            price -= Integer.parseInt(sc.nextLine());
        }
        System.out.println(price);
    }
}