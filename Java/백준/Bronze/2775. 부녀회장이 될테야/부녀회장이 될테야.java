import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bf.readLine());
		while(T>0) {
			int k = Integer.parseInt(bf.readLine());
			int n = Integer.parseInt(bf.readLine());
			
			int arr[] = new int[n];
			for(int i = 0; i < arr.length; i++)
				arr[i] = i+1;
			
			for (int a = 0; a < k; a++) {
				for (int i = arr.length-1; i >= 0; i--) {
					for (int j = i-1; j >= 0; j--) {
						arr[i] += arr[j];
					}
				}
			}
			
			bw.write(arr[n-1]+"\n");
			T--;
		}
		bw.flush();		
	}

}