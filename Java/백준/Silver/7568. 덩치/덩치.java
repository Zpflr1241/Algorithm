import java.io.*;
import java.util.StringTokenizer;

public class Main {
	//7568 덩치	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		int arr[][]	= new int[N][2];
		for(int i = 0 ; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken()); 
		}
		for(int i = 0 ; i < N ; i++) {
			int res  = 0;
			for(int j = 0 ; j < N ; j++) {
				if(i == j) continue;
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					res++;
			}
			bw.write((res+1)+" ");
		}
		bw.close();
	}
}