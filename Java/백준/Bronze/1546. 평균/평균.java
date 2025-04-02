import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = 0;
        double hap = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if(M < arr[i]) M = arr[i];
        }
        for(int i = 0; i < N; i++) {
            hap += arr[i] / (double)M * 100;
        }
        System.out.println(hap/(double)N);
    }
}