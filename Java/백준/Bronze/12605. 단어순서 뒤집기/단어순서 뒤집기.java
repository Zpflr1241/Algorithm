import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= n; i++) {
            String arr[] = bf.readLine().split(" ");
            bw.write("Case #"+i+": ");
            for(int j = arr.length-1; j >= 0; j--){
                bw.write(arr[j]+" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}