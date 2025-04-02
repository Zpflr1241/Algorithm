import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arr[] = new int[26];
		Arrays.fill(arr, -1);
		Scanner sc = new Scanner(System.in);
		String sbro[] = sc.nextLine().split("");
		for(int i = 0; i < sbro.length; i++) {
			for(int j = 97; j <= 122; j++) {
				if(sbro[i].charAt(0) == j && arr[j-97] == -1) {
					arr[j-97] = i;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}