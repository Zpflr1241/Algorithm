import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String arr[] = bf.readLine().split("");
        int hap = 0;
        for (int i = 0; i < n; i++) {
            hap += Integer.parseInt(arr[i]);
        }
        bw.write(""+hap);
        bw.close();
    }
}