import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tolong = sc.nextInt();
        for (int i = 0; i < tolong/4; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}