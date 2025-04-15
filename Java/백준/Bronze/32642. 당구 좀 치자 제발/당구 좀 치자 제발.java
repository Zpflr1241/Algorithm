import java.io.*;

public class Main {
    // 32642 당구 좀 치자 제발
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        long res = 0;
        long tmp = 0;
        String arr[] = bf.readLine().split(" ");
        for(String v : arr){
            tmp += (Integer.parseInt(v) == 0 ? -1 : 1);
            res += tmp;
        }
        bw.write(Long.toString(res));
        bw.close();
    }
}