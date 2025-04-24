import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] v = new int[Integer.parseInt(bf.readLine())];
        v[0] = 1;
        int[][] e = new int[Integer.parseInt(bf.readLine())][2];
        for (int i = 0; i < e.length; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            e[i][0] = Integer.parseInt(st.nextToken());
            e[i][1] = Integer.parseInt(st.nextToken());
            if(e[i][0] >= e[i][1]){
                int temp = e[i][0];
                e[i][0] = e[i][1];
                e[i][1] = temp;
            }
        }
        int j;
        for (int i = 1; i < e.length; i++) {
            int[] key = e[i];
            for (j = i - 1; j >= 0; j--) {
                if (key[0] <= e[j][0]) {
                    e[j + 1] = e[j];
                } else break;
            }
            e[j + 1] = key;
        }
        for (j = 0; j < e.length; j++) {
            for (int i = 0; i < e.length; i++) {
                if(v[e[i][0]-1] == 1 || v[e[i][1]-1] == 1){
                    v[e[i][0]-1] = v[e[i][1]-1] = 1;
                }
            }
        }

        int cnt = -1;
        for (int i = 0; i < v.length; i++) {
            if(v[i] == 1) cnt++;
        }
        System.out.println(cnt);
    }
}