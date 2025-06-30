import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[8][8];
        int cnt=0;
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine().split("");
            
            for (int j = 0; j < arr[i].length; j++) 
                if(arr[i][j].equals("F") && (j+i%2)%2==0) cnt++;
            
        }
        System.out.println(cnt);
    }
}