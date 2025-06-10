import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String str_arr[] = str.split("");
        int int_arr[] = new int[13];
        int index = 0;
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*'){
                index = i;
                str_arr[i] = "-1";
                break;
            }
        }
        for (int i = 0; i < str_arr.length; i++)
            int_arr[i] = Integer.parseInt(str_arr[i]);

        for (int i = 0; i < 10; i++) {
            int_arr[index] = i;
            for (int j = 0; j < int_arr.length-1; j++)
                res += j%2==0 ? int_arr[j] : int_arr[j]*3;

            if((res+int_arr[12])%10 == 0){
                System.out.println(i);
                break;
            }
            res = 0;
        }
    }
}