import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int res = (text.charAt(0) == 'c') ? 26 : 10;
        if(text.length() == 1){
            System.out.println(res);
            return;
        }
        for (int i = 1; i < text.length(); i++) {
            if(text.charAt(i) == 'c'){
                if(text.charAt(i-1) == 'c')
                    res *= 25;
                else
                    res *= 26;
            }
            else{
                if(text.charAt(i-1) == 'd')
                    res *= 9;
                else
                    res *= 10;
            }
        }
        System.out.println(res);
    }
}