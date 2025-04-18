import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bf.readLine());
        int arr[][] = new int[41][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        for (int j = 2; j <= 40; j++) {
            arr[j][0] = arr[j-2][0] + arr[j-1][0];
            arr[j][1] = arr[j-2][1] + arr[j-1][1];
        }
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(arr[n][0]+" "+arr[n][1]+"\n");
        }
        bw.close();
    }
}