import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String bio[] = ((a*b*c)+"").split("");
		int arr[] = new int[10];
		Arrays.fill(arr,0);
		for(int i = 0; i < bio.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(Integer.parseInt(bio[i]) == j) arr[j]++;
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}