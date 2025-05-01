import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int per = sc.nextInt();
        System.out.println((100.0/per)+"\n"+(100.0/(100-per)));
    }
}