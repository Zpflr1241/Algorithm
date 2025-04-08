import java.io.*;

public class Main {
    //10989 수 정렬하기
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        int arr[] = new int[N];
        int max = 0;

        for(int i = 0; i < N; i++){
            int t = Integer.parseInt(bf.readLine());
            if(t > max) max = t;
            arr[i] = t;
        }

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
        for (int i = 1; i < sorted.length; i++) {
            bw.write(sorted[i]+"\n");
        }

        bw.close();
    }
}