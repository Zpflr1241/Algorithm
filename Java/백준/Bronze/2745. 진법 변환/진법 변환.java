import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sbro = sc.next();
		String slist[] = sbro.split("");
		int jin = sc.nextInt();
		int hap = 0;
		for(int i = 0; i < sbro.length(); i++) {
			hap +=  slist[i].charAt(0) >= 65 ?
					(slist[i].charAt(0)-55) * Math.pow(jin, sbro.length()-1-i) :
						Integer.parseInt(slist[i]) * Math.pow(jin, sbro.length()-1-i);
		}	
		System.out.println(hap);
	}
}