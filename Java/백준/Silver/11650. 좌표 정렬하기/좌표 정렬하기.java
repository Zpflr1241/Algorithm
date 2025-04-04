import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[][] merge_sort(int[][] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[][] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
        int[][] right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }

    static int[][] merge(int[][] arr1, int[][] arr2){
        int[][] res = new int[arr1.length+arr2.length][2];
        int index1 = 0, index2 = 0;
        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1][0] < arr2[index2][0]){
                res[index1+index2] = arr1[index1];
                index1++;
            }else if(arr1[index1][0] == arr2[index2][0] && arr1[index1][1] < arr2[index2][1]){
                res[index1+index2] = arr1[index1];
                index1++;
            }else {
                res[index1+index2] = arr2[index2];
                index2++;
            }
        }
        if(index1 == arr1.length){
            for (int i = index2; i < arr2.length; i++) {
                res[index1+i] = arr2[i];
            }
        }else{
            for (int i = index1; i < arr1.length; i++) {
                res[index2+i] = arr1[i];
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //선언
        int N = Integer.parseInt(bf.readLine());
        int[][] pos = new int[N][2];
        //입력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            pos[i][0] = Integer.parseInt(st.nextToken());
            pos[i][1] = Integer.parseInt(st.nextToken());
        }
        pos = merge_sort(pos);

        for (int i = 0; i < N; i++) {
            bw.write(pos[i][0]+" "+pos[i][1]+"\n");
        }
        bw.close();
    }
}