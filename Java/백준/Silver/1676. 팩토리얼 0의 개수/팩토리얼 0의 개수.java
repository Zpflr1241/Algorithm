import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	//1676 팩토리얼 0의 개수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger f = new BigInteger("1");
		int N = sc.nextInt();
		int res = 0;
		for(int i = N; i>0; i--) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		String arr = String.valueOf(f);
		for(int i = arr.length()-1; i >= 0;i--) {
			if(arr.charAt(i) == '0') res++;
			else break;
		}
		System.out.println(res);
		
	}

}