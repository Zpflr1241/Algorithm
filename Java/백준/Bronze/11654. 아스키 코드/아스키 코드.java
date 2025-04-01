import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        byte asd = (byte)bf.readLine().charAt(0);
        bw.write(""+asd);
        bw.close();
    }
}