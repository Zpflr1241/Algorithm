import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        String arr[] = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = bf.readLine();
        }
        arr = Arrays.stream(arr).distinct().toArray(String[]::new); // 중복제거라고함
        N = arr.length;
        String key;

        int j;
        for (int i = 1; i < N; i++) {
            key = arr[i];
            for (j = i-1; j >= 0; j--) {
                if(arr[j].length() > key.length()){
                    arr[j+1] = arr[j];
                }else
                    break;
            }
            arr[j+1] = key;
        }
        for (int i = 1; i < N; i++) {
            key = arr[i];
            for (j = i-1; j >= 0; j--) {
                if(arr[j].length() == key.length() && key.compareTo(arr[j])<0){
                    arr[j+1] = arr[j];
                }else
                    break;
            }
            arr[j+1] = key;
        }
        for (int i = 0; i < N; i++) {
            bw.write(arr[i]+"\n");
        }
        bw.close();
    }
}