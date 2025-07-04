import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        StringBuffer bin = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            int temp = Integer.parseInt(arr[i]);
            StringBuffer str = new StringBuffer("000");
            for (int j = 4; j > 0; j /= 2) {
                if(temp/j==1){
                    str.delete(2/j,2/j+1);
                    str.insert(2/j,"1");
                    temp -= j;
                }
            }
            bin.append(str);
        }
        if(bin.toString().equals("000"))
            System.out.println("0");
        else{
            while(bin.charAt(0) == '0') bin.delete(0,1);
            System.out.println(bin);
        }
    }
}