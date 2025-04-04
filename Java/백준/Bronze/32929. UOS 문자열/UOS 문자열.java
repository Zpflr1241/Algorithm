import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num%3) {
		case 0: System.out.println("S"); break;
		case 1: System.out.println("U"); break;
		case 2: System.out.println("O"); break;
		}
	}
}