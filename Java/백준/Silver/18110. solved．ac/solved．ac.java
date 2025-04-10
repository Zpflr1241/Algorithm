import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 18110 solved.ac
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int sub = (int)Math.round(N*0.15);
		
        int arr[] = new int[N];
        int max = 0;

        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(bf.readLine());
            if(tmp > max) max = tmp;
            arr[i] = tmp;
        }
        //
        int count[] = new int[max+1];
        int sorted[] = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            ++count[arr[i]];
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        for (int i = arr.length-1; i >= 0; i--) {
            sorted[count[arr[i]]] = arr[i];
            count[arr[i]]--;
        }
        //
        long res = 0;
		for(int i = sub+1; i < arr.length-sub+1; i++) {
			res += sorted[i];
		}
		if(N == 0)
			System.out.println(0);
		else
			System.out.println(Math.round(res/(N-2.0*sub)));
	}

}