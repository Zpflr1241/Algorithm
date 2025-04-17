import java.io.*;

public class Main {
    // 1032 명령 프롬프트
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        String arr[] = new String[N];
        
        for (int i = 0; i < arr.length; i++)
            arr[i] = bf.readLine();
        
        char res[] = arr[0].toCharArray();

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length(); j++) {
                if(arr[0].charAt(j) != arr[i].charAt(j)){
                    res[j] = '?';
                }
                else if(res[j] != '?'){
                    res[j] = arr[0].charAt(j);
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            bw.write(res[i]);
        }
        bw.close();
    }
}