import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = sc.nextLine().split(" ");
		int tmp = arr.length;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=="") tmp--;
		}
		System.out.println(tmp);
	}
}