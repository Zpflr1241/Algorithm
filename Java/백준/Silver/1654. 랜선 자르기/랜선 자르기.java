import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int K = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
        int arr[] = new int[K];
        long max = 0;
        long min = 1;
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            if(max <= arr[i]) max = arr[i];
        }
        long realmax = max;
        long mid;
        while(true){
            mid = (max+min)/2;
            //if(mid == 0) mid = 1;
            long res = 0;
            for (int i = 0; i < arr.length; i++) {
                res += arr[i]/mid;
            }
            if(min+1 >= max){
                long hap = 0;
                for (int i : arr) {
                    hap+=i;
                }
                if(realmax*arr.length==hap && realmax == mid+1) {
                    mid+=1;
                }
                break;
            }

            if(res >= N) {
                min = mid;
            }
            else max = mid;

        }
        bw.write(Long.toString(mid));
        bw.close();
    }
}