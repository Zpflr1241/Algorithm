import java.util.Scanner;

public class Main {
    //28702 FizzBuzz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0) < 58){
                num = Integer.parseInt(arr[i]) + 3 - i;
                break;
            }
        }
        if(num%3 == 0 && num%5 == 0){
            System.out.println("FizzBuzz");
        }else if(num%3 == 0 && num%5 != 0){
            System.out.println("Fizz");
        }else if(num%3 != 0 && num%5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }
    }
}