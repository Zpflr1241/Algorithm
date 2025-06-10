import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.nextLine().contains("9")){
            System.out.println("F");
        }else{
            System.out.println("S");
        }
    }
}