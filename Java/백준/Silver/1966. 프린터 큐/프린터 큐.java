import java.io.*;
import java.util.*;

public class Main {
    // 1966 프린터 큐
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());
        while(T>0){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int req = Integer.parseInt(st.nextToken());
            String qe[] = new String[n];
            StringTokenizer values = new StringTokenizer(bf.readLine());
            int index = 0;
            for (int i = 0; i < n; i++) {
                qe[i] = (values.nextToken()+i);
                index++;
            }

            int su = 1;
            while(index > 0){
                boolean res = true;
                for (int i = 1; i < n; i++) {
                    if (qe[0].charAt(0) < qe[i].charAt(0)) {
                        res = false;
                        break;
                    }
                }
                if(res){
                    if(Integer.parseInt(qe[0].substring(1,qe[0].length())) == req) {
                        bw.write(su+ "\n");
                        break;
                    }
                    su++;
                    String tmp = ""+0+qe[0].charAt(1);
                    for (int i = 1; i < index; i++) {
                        qe[i-1] = qe[i];
                    }
                    qe[index-1] = tmp;
                    index--;
                }
                else{
                    String tmp = qe[0];
                    for (int i = 1; i < index; i++) {
                        qe[i-1] = qe[i];
                    }
                    qe[index-1] = tmp;
                }
            }
            T--;
        }


        bw.close();


    }
}