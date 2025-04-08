import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.nextLine());
		BigInteger res = new BigInteger(0+"");
		BigInteger val = new BigInteger(1+"");
		String arr = sc.nextLine();
		long mod = 1234567891;
		for(int i = 0; i < arr.length(); i++) {
			res = res.add(val.multiply(BigInteger.valueOf(arr.charAt(i)-96)));
			res = res.mod(BigInteger.valueOf(mod));
			val = val.multiply(BigInteger.valueOf(31)).mod(BigInteger.valueOf(mod));
		}
		System.out.println(res);
		sc.close();

	}
 }