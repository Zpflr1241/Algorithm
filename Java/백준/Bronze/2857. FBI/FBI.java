import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            if(sc.nextLine().contains("FBI"))
                bf.append((i+1)+" ");
        }
        if(bf.length() != 0)
            System.out.println(bf);
        else
            System.out.println("HE GOT AWAY!");
    }
}