import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int arr[] = new int[N];
        int cnt = 0;
        for(int i = 0; i<N; i++) {
            arr[i] = sc.nextInt();
            
            if(arr[i] == 2) cnt++;
            for(int j = 2; j < arr[i]; j++) {
                if(arr[i]%j == 0)
                    break;
                else if(j+1 == arr[i]) cnt++;
            }
        }
        System.out.println(cnt);
    }
}