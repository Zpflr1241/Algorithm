import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] abc = new int[26]; // 97 a
        String str;
        while((str = bf.readLine()) != null){
            str = str.replaceAll(" ","");
            for (int i = 0;i < str.length(); i++){
                abc[((int)str.charAt(i))-97]++;
            }
        }
        int max = 0;
        for(int i : abc)
            if(max < i) max = i;
        for (int i = 0; i < abc.length; i++) {
            if(max == abc[i]){
                System.out.print((char)(i+97));
            }
        }
    }
}