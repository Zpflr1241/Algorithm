import java.io.*;

public class Main {
	// 9012 괄호
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bf.readLine());
		for(int i = 0 ; i < T ; i++) {
			String arr = bf.readLine();
			int res = 0;
			for(int j = 0; j < arr.length(); j++) {
				if(arr.charAt(j) == 40) {
					res++;
				}else if(arr.charAt(j) == 41) {
					res--;
				}
				if(res < 0) break;
			}
			if(res == 0)
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}
		bw.close();
	}
}