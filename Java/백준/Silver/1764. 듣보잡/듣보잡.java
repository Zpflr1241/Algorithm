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
        HashMap<String, Integer> hash = new HashMap<>();
        int index = 0;

        for (int i = 0; i < N; i++) {
            hash.put(bf.readLine(),0);
        }

        for (int i = 0; i < M; i++) {
            String input = bf.readLine();
            if(hash.containsKey(input)){
                hash.put(input,1);
                index++;
            }
            else{
                hash.put(input,0);
            }
        }

        String arr[] = new String[index];
        index = 0;
        for(String key : hash.keySet()){
            if(hash.get(key) == 1){
                arr[index] = key;
                index++;
            }
        }
        int j;
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            for (j = i - 1;  j >= 0; j--) {
                if(key.compareToIgnoreCase(arr[j])<=0){
                    arr[j+1] = arr[j];
                }
                else break;
            }
            arr[j+1] = key;
        }

        bw.write(Integer.toString(index));
        bw.write("\n");
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.close();
    }
}