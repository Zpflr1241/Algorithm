import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			boolean res = false;
			if(a+b+c == 0) break;
			if(a > b && a > c) res = (Math.pow(a, 2) == (Math.pow(b, 2)+Math.pow(c, 2)));
			if(b > a && b > c) res = (Math.pow(b, 2) == (Math.pow(a, 2)+Math.pow(c, 2)));
			if(c > b && c > a) res = (Math.pow(c, 2) == (Math.pow(a, 2)+Math.pow(b, 2)));
			if(res)
				System.out.println("right");
			else
				System.out.println("wrong");			
		}		
	}
}