import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arr[] = bf.readLine().split("");
        int i = Integer.parseInt(bf.readLine());
        bw.write(""+arr[i-1]);
        bw.close();
    }
}