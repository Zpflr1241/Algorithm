import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j) continue;
                for (int k = 0; k < N; k++) {
                    if(i == j || j == k || i == k) continue;
                    if(max < (arr[i] + arr[j] + arr[k]) && M >= (arr[i] + arr[j] + arr[k]))
                        max = arr[i] + arr[j] + arr[k];
                }
            }
        }
        System.out.println(max);
    }
}