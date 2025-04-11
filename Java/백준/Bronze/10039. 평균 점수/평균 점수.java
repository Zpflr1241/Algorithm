import java.util.Scanner;

public class Main {
	// 10039 평균 점수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int tmp = sc.nextInt();
			if(40 >= tmp) {
				sum += 40;
			}else {
				sum += tmp;
			}
		}
		System.out.println(sum/5);
	}
}