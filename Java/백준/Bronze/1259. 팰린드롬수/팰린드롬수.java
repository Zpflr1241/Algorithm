import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(;;){
            String arr1[] = sc.nextLine().split("");
            boolean pel = false;
            if(arr1[0].charAt(0) == '0') break;
            String arr2[] = new String[arr1.length];
            for (int i = arr1.length-1; i >= 0; i--) {
                arr2[i] = arr1[arr1.length-i-1];
            }
            
            for (int i = 0; i < arr1.length; i++) {
                if(Integer.parseInt(arr1[i]) != Integer.parseInt(arr2[i])) break;
                else if(i+1 == arr1.length) pel = true;
            }
            if (pel) System.out.println("yes");
            else System.out.println("no");
        }
    }
}