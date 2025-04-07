import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        int j, key;
        for (int i = 1; i < 3; i++) {

            key = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if(arr[j] > key)
                    arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = key;
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}