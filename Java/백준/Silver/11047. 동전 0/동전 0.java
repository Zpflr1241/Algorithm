import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int coin[] = new int[N];
        int index = -1;
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(bf.readLine());
            index++;
        }
        int cnt = 0;
        while(K > 0){
            if(K < coin[index]){
                index--;
            }
            else{
                while(K >= coin[index]){
                    K -= coin[index];
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}