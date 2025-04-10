import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String table = "aeiouAEIOU";
		while(true) {
			String word = bf.readLine();
			if(word.equals("#")) break;
			int res = 0;
			for(int i = 0; i < word.length() ; i++) {
				for(String s: table.split("")) {
					if((word.charAt(i)+"").equals(s)) 
						res++;
				}
			}
			bw.write(res+"\n");
			bw.flush();
		}
	}
}