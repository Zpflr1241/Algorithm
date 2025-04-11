import java.io.*;

public class Main {
	// 10773 제로
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = Integer.parseInt(bf.readLine());
		int index = 0;
		int arr[] = new int[K];
		int res = 0;
		for(int i = 0; i < K ; i++) {
			int tmp = Integer.parseInt(bf.readLine());
			if(tmp != 0) {
				arr[index] = tmp;
				index++;
			}else {
				arr[index-1] = 0;
				index--;
			}
		}
		
		for(int i = 0; i < index; i++) {
			res += arr[i];
		}
		bw.write(res+"");
		bw.close();
	}
}