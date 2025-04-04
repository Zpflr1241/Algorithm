import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int chess(int N, int M, char arr[][]) throws IOException{
        int[] cnt = new int[(N-7)*(M-7)*2];
        char comp;
        for (int n = 0; n < N-7; n++) {
            for (int m = 0; m < M-7; m++) {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if((j+1+i)%2==1)
                            comp = 'B';
                        else
                            comp = 'W';
                        if (arr[i+n][j+m] != comp) {
                            cnt[n*(M-7)+m]++;
                        }
                    }
                }

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if((j+1+i)%2==0)
                            comp = 'B';
                        else
                            comp = 'W';
                        if (arr[i+n][j+m] != comp) {
                            cnt[n*(M-7)+m+((N-7)*(M-7))]++;
                        }
                    }
                }
            }
        }
        Arrays.sort(cnt); // G O D

        return cnt[0];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M]; //배열 선언
        for (int i = 0; i < N; i++) { // 값 입력받기
            arr[i] = bf.readLine().toCharArray();
        }
        System.out.print(chess(N,M,arr));
    }
}