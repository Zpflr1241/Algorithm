import java.util.Scanner;

public class Main {
    // 1267 핸드폰 요금
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String arr[] = sc.nextLine().split(" ");
        int Y = 0, M = 0; // 영식 민식

        for (int i = 0; i < arr.length; i++) {
            int bil = Integer.parseInt(arr[i]);
            Y += (bil/30)*10+10;
            M += (bil/60)*15+15;
        }
        if(Y > M){
            System.out.println("M "+M);
        }
        else if(Y == M){
            System.out.println("Y M "+M);
        }
        else {
            System.out.println("Y " +Y);
        }
    }
}