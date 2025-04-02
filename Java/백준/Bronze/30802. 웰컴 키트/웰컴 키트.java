import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int size[] = new int[6];
		for(int i = 0;i<6;i++) {
			size[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		int p = sc.nextInt();
		int tmp1 = 0;
		for(int i=0;i<size.length;i++) {
			if(size[i] == 0)
				continue;
			else if(size[i]/t == 0)
				tmp1++;
			else if(size[i]%t == 0)
				tmp1 += size[i]/t;
			else
				tmp1 += size[i]/t+1;
		}
		System.out.println(tmp1);
		System.out.print(N/p+" "+N%p);
	}
}