import java.io.*;
import java.util.StringTokenizer;

public class Main {
	// 1929 소수 구하기
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		for(int i = M; i <= N ; i++) {
			if(i == 1) continue;
			boolean sosu = true;
			for(int j = 2 ; j < (int)Math.sqrt(i)+1 ; j++) {
				if(i%j == 0) {
					sosu = false;
					break;
				}
			}
			if(sosu) bw.write(i+"\n");
		}
		bw.close();
	}
}