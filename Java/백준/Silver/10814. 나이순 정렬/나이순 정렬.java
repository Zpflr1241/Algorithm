import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static String[][] merge_sort(String[][] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length / 2;
        String[][] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
        String[][] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    static String[][] merge(String[][] arr1, String[][] arr2) {
        String[][] res = new String[arr1.length+arr2.length][3];
        int index1 = 0, index2 = 0;
        while (index1 < arr1.length && index2 < arr2.length) {
            if(Integer.parseInt(arr1[index1][0]) < Integer.parseInt(arr2[index2][0])) {
                res[index1+index2] = arr1[index1];
                index1++;
            }
            else if(Integer.parseInt(arr1[index1][0]) == Integer.parseInt(arr2[index2][0]) &&
                    Integer.parseInt(arr1[index1][2]) < Integer.parseInt(arr2[index2][2])){
                res[index1+index2] = arr1[index1];
                index1++;
            }
            else {
                res[index1+index2] = arr2[index2];
                index2++;
            }
        }
        if(index1 == arr1.length) {
            for(int i = index2; i < arr2.length; i++ )
                res[index1+i] = arr2[i];
                //res.add(arr2[i]);
        }
        else {
            for(int i = index1; i < arr1.length; i++ )
                res[index2+i] = arr1[i];
                //res.add(arr1[i]);
        }

        return res;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(bf.readLine());
        String[][] member = new String[N][3];

        for(int i  = 0; i < N; i++) { //N만큼 age와 name을 입력받음
            StringTokenizer st = new StringTokenizer(bf.readLine());
            member[i][0] = st.nextToken();
            member[i][1] = st.nextToken();
            member[i][2] = i+"";
        }

        member = merge_sort(member);

        for(int i  = 0; i < N; i++) { // 출력
            bw.write(member[i][0]+" "+member[i][1]+"\n");
        }
        bw.close();
    }
}