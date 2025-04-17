import java.io.*;
import java.util.Arrays;

public class Main {
    // 11723 집합
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(bf.readLine());
        int S[] = new int[20];
        int index = 0;
        for (int i = 0; i < M; i++) {
            String req[] = bf.readLine().split(" ");
            switch (req[0]){
                case "add":
                    for (int j = 0; j <= index; j++){
                        if(Integer.parseInt(req[1]) == S[j])
                            break;
                        else if(j == index){
                            S[index++] = Integer.parseInt(req[1]);
                            break;
                        }
                    }
                    break;

                case "remove":
                    for (int j = index; j >= 0; j--) {
                        if(Integer.parseInt(req[1]) == S[j]){
                            S[j] = 0;
                            for (int k = j+1; k <= index; k++) {
                                S[k-1] = S[k];
                            }
                            S[index] = 0;
                            index--;
                            break;
                        }
                    }
                    break;

                case "check":
                    for (int j = 0; j <= index; j++){
                        if(Integer.parseInt(req[1]) == S[j]){
                            bw.write("1\n");
                            break;
                        }
                        else if(j == index){
                            bw.write("0\n");
                        }
                    }
                    break;

                case "toggle":
                    for (int j = index; j >= 0; j--) {
                        if(Integer.parseInt(req[1]) == S[j]){
                            for (int k = j; k < index; k++) {
                                S[k] = S[k+1];
                            }
                            index--;
                            break;
                        }
                        else if(j == 0){
                            S[index] = Integer.parseInt(req[1]);
                            index++;
                        }
                    }
                    break;

                case "all":
                    for (int j = 0; j < 20; j++) {
                        S[j] = j+1;
                    }
                    index = 19;
                    break;

                case "empty":
                    Arrays.fill(S,0);
                    index = 0;
                    break;

            }
        }
        bw.close();

    }
}