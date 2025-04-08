import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.nextLine());
		int res = 0;
		String arrs[] = sc.nextLine().split("");
		for(int i = 0; i < L; i++) {
			res += ((arrs[i].charAt(0))-96)*Math.pow(31,i);
		}
		System.out.println(res);
		sc.close();
	}

 }