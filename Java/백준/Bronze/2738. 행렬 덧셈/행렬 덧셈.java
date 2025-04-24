import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr1[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++)
                arr1[i][j] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] += Integer.parseInt(st2.nextToken());
                bw.write(arr1[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.close();

    }
}