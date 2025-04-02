import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<T; i++) {
			String arr[] = sc.nextLine().split("");
			int tmp = 0, answer = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].charAt(0)=='O') {
					answer += ++tmp;
				}else {
					tmp = 0;
				}
			}
			System.out.println(answer);
		}
	}
}