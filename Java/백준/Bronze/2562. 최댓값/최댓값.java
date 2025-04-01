import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int max = 0;
        int where = 0;
        for (int i = 0; i < 9; i++) {
            arr.add(Integer.parseInt(bf.readLine()));
        }
        for (int i = 0; i < 9; i++) {
            if(max <= arr.get(i)) {
                max = arr.get(i);
                where = i+1;
            }
        }
        bw.write(""+max+"\n"+where);
        bw.close();
    }
}