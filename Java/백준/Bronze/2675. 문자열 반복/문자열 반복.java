import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            String arr[] = bf.readLine().split(" ");
            String stra[] = arr[1].split("");

            for (int j = 0; j < stra.length; j++) {
                for (int k = 0; k < Integer.parseInt(arr[0]); k++) {
                    bw.write(stra[j]);
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}