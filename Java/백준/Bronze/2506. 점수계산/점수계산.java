import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int res = 0;
        int answer = Integer.parseInt(sc.nextLine());
        int arr[] = new int[answer];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
                res += ++score;
            else
                score = 0;
        }
        System.out.println(res);
    }
}