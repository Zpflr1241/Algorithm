import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    // 10816 숫자 카드 2

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //카드
        HashMap<Integer, Integer> hash = new HashMap<>();
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(hash.containsKey(tmp)){
                hash.replace(tmp,hash.get(tmp)+1);
            }else{
                hash.put(tmp,1);
            }
        }
        int M = Integer.parseInt(bf.readLine());
        int find[] = new int[M];
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            find[i] = Integer.parseInt(st1.nextToken());
        }

        for(int val: find){
            bw.write(Integer.toString(hash.getOrDefault(val,0)));
            bw.write(" ");
        }
        bw.close();

    }
}