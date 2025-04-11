import java.io.*;

public class Main {
	// 4949 균형잡힌 세상
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String arr = bf.readLine();
			if(arr.equals(".")) break;
			int res = 0;
			int res1 = 0;
			int stack[] = new int[110];
			int index = 0;
			boolean bruh = false;
			for(int j = 0; j < arr.length(); j++) {
				if(arr.charAt(j) == 40) {
					stack[index] = 40;
					index++;
				}else if(arr.charAt(j) == 41) {
					if(index == 0) {
						bruh = true;
						break;
					}
					else if(stack[index-1] == 40) {
						index--;
						stack[index] = 0;
					}else {
						bruh = true;
						break;
					}
					
				}
				if(arr.charAt(j) == 91) {
					stack[index] = 91;
					index++;
				}else if(arr.charAt(j) == 93) {
					if(index == 0) {
						bruh = true;
						break;
					}
					else if(stack[index-1] == 91) {
						index--;
						stack[index] = 0;
					}else {
						bruh = true;
						break;
					}
					
				}
				if(index < 0) {
					bruh = true;
					break;
				}
			}
			if(index > 0) bruh = true;
			if(!bruh)
				bw.write("yes\n");
			else
				bw.write("no\n");
		}
		bw.close();
	}
}