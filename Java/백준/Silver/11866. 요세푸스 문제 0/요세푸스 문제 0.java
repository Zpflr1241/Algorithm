import java.io.*;
import java.util.*;

public class Main {
    // 11866 요세푸스 문제
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        int tmp = N;
        int index = -1;
        bw.write("<");
        while(tmp > 0){
            for (int i = 0; i < K;) {
                index = (index+1)%N;
                if(arr[index] != 0){
                    i++;
                }
            }
            bw.write(Integer.toString(arr[index]));
            arr[index] = 0;
            tmp--;
            if(tmp == 0) break;
            bw.write(", ");
        }
        bw.write(">");
        bw.close();
    }
}