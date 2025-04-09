import java.util.Scanner;

public class Main {
	//1436 영화감독 숌
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 666, res = 1;
		while(res < N) {
			i++;
			String arr = i+"";
			if(arr.contains("666")) {
				res++;
			}
		}
		System.out.println(i);
	}
}