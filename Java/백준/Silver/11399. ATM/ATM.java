import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int j;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            for (j = i-1; j >=0 ; j--) {
                if(key <= arr[j]){
                    arr[j+1] = arr[j];
                }
                else break;
            }
            arr[j+1] = key;
        }
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
            res += arr[i];
        }
        System.out.println(res);
    }
}