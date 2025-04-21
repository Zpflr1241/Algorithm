import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 3; i++) {
            String[] input = bf.readLine().split(" ");
            int res = 0;
            for (String v : input) {
                res += Integer.parseInt(v);
            }
            switch (res){
                case 0:
                    bw.write("D\n");
                    break;
                case 1:
                    bw.write("C\n");
                    break;
                case 2:
                    bw.write("B\n");
                    break;
                case 3:
                    bw.write("A\n");
                    break;
                case 4:
                    bw.write("E\n");
                    break;
            }
        }
        bw.close();
    }
}