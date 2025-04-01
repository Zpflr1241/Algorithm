import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(bf.readLine());
        String arr[] = bf.readLine().split(" ");
        int min = Integer.parseInt(arr[0]), max = Integer.parseInt(arr[0]);
        for (int i = 0; i < n; i++) {
            if(max <= Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
            }
            if(min >= Integer.parseInt(arr[i])){
                min = Integer.parseInt(arr[i]);
            }
        }
        bw.write(min+" "+max);
        bw.close();
    }
}