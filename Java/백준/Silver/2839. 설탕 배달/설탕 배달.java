import java.util.Scanner;

public class Main {
	// 2839 설탕배달
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		double y = 0;
		int res = n;
		for(int i = 0; i < n ; i++) {
			y = (n - 3*x)/5.0;
			if(y>=0 && y%1 == 0 && res >= (x+y)) {
				res = x+(int)y;
			}
			x++;
		}
		if(res == n) res = -1;
		System.out.println(res);	
	}

}