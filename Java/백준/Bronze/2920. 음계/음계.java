import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int arr[] = new int[8];
			boolean judge = false;
			for(int i=0;i<8;i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=0; i<7; i++) {
				if(arr[i]+1 == arr[i+1]) {
					if(i==6) {
						System.out.println("ascending");
					    judge = true;
					}
					continue;
				}
				else
					break;
			}
			if(!judge) {
				for(int i=0; i<7; i++) {
					if(arr[i]-1 == arr[i+1]) {
						if(i==6) System.out.println("descending");
						continue;
					}
					else {
						System.out.println("mixed");
						break;
					}
				}
			}
	}

}