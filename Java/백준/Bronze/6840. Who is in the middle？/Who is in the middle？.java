import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        for (int i = 0; i < 3; i++) {
            arr[Integer.parseInt(sc.nextLine())]++;
        }
        int cc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                if (cc == 0)
                    cc++;
                else {
                    System.out.println(i);
                    break;
                }
        }
    }
}