import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < K; i++) {
            int P = sc.nextInt()*100/N;
            if(P <= 4)
                bf.append("1 ");
            else if(P <= 11)
                bf.append("2 ");
            else if (P <= 23)
                bf.append("3 ");
            else if (P <= 40)
                bf.append("4 ");
            else if (P <= 60)
                bf.append("5 ");
            else if (P <= 77)
                bf.append("6 ");
            else if (P <= 89)
                bf.append("7 ");
            else if (P <= 96)
                bf.append("8 ");
            else
                bf.append("9 ");
        }
        System.out.println(bf);
    }
}