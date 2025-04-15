import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // 1547 공
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int arr[] = {1,2,3};
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int index1 = 0, index2 = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[j] == a) {
                    index1 = j;
                } else if (arr[j] == b) {
                    index2 = j;
                }
            }
            int tmp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = tmp;
        }
        bw.write(Integer.toString(arr[0]));
        bw.close();
    }
}