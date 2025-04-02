import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt()%42;
		}
		for(int i=0; i<10; i++) {
			for(int j=i+1; j<10;j++) {
				if(arr[i]==arr[j])
					arr[j]= -1;
			}
		}
		int tmp = 0;
		for(int i = 0; i<10;i++) {
			if(arr[i]!=-1) tmp++;
		}
		System.out.println(tmp);
	}
}