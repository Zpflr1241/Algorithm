import java.util.Scanner;

public class Main {
	//5532 방학숙제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		a = a/c + (a%c > 0 ? 1 : 0);
		b = b/d + (b%d > 0 ? 1 : 0);
		if(a>=b) System.out.println(l-a);
		else System.out.println(l-b);
		
	}

}