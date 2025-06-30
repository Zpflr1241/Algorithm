import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        String[] temp = {sc.nextLine(), sc.nextLine(), sc.nextLine()};
        long res = 0;
        long n1 = 0, n2 = 0, n3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(temp[0])) n1 = i;
            if(arr[i].equals(temp[1])) n2 = i;
            if(arr[i].equals(temp[2])) n3 = (long)Math.pow(10,i);
        }

        System.out.println((n1*10+n2)*n3);
    }
}