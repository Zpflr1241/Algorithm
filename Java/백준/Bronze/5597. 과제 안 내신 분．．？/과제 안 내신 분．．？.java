import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[30];
        int res[] = new int[2];
        int index = 0;
        for (int i = 0; i < 28; i++) {
            arr[Integer.parseInt(bf.readLine())-1] = 1;
        }
        for (int i = 0; i < 30; i++) {
            if(arr[i] == 0)
                res[index++] = i+1;
        }
        if(res[0] >= res[1]){
            System.out.println(res[1]+"\n"+res[0]);
        }else{
            System.out.println(res[0]+"\n"+res[1]);
        }
    }
}