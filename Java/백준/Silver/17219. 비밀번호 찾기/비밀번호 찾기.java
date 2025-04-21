import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,String> hash = new HashMap<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(bf.readLine());
            hash.put(st1.nextToken(),st1.nextToken());
        }

        String arr[] = new String[M];
        for (int i = 0; i < M; i++) {
            arr[i] = bf.readLine();
        }
        for(String key : arr){
            bw.write(hash.get(key)+"\n");
        }
        bw.close();
    }
}