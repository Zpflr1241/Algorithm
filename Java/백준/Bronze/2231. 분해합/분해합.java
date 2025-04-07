import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            String arr[] = (i+"").split("");
            int comp = i;
            for (int j = 0; j < arr.length; j++) {
                comp += Integer.parseInt(arr[j]);
            }
            if(comp == N){
                System.out.println(i);
                break;
            }
            else if(i == N) System.out.println(0);
        }
    }
}