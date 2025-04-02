import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < T; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int ht = 1, wt=0;
			for(int j=0;j<w;j++) {
			    wt = 0;
				for(int k=0;k<h;k++) {
					if(n!=0) {n--; wt++;}
					else break;
				}
				if(n!=0) ht++;
				else break;
			}
			System.out.printf(wt+"%02d\n",ht);
		}
	}
}