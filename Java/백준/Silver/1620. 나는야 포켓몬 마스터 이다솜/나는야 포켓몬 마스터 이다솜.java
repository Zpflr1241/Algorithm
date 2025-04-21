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

        HashMap<Integer, String> hash1 = new HashMap<>();
        HashMap<String, Integer> hash2 = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String input = bf.readLine();
            hash1.put(i, input);
            hash2.put(input, i);
        }
        String[] arr = new String[M];
        for (int i = 0; i < M; i++) {
            arr[i] = bf.readLine();
        }

        for (String input : arr) {
            try{
                bw.write(hash1.get(Integer.parseInt(input))+"\n");
            }catch (Exception e){
                bw.write(hash2.get(input)+"\n");
            }

        }
        bw.close();

    }
}