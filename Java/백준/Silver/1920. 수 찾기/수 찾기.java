import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] merge_sort(int[] arr) {
        if(arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int index1 = 0, index2 = 0;
        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] < arr2[index2]){
                res[index1+index2] = arr1[index1];
                index1++;
            }
            else {
                res[index1+index2] = arr2[index2];
                index2++;
            }
        }
        if(index1 == arr1.length){
            for (int i = index2; i < arr2.length; i++) {
                res[index1 + i] = arr2[i];
            }
        }
        else{
            for (int i = index1; i < arr1.length; i++) {
                res[index2 + i] = arr1[i];
            }
        }
        return res;
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (target == arr[mid]) {
                return 1;
            }else if (arr[mid] < target) {
                start = mid + 1;
            }else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //----
        int N = Integer.parseInt(bf.readLine());
        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        arr = merge_sort(arr);

        //----
        int M = Integer.parseInt(bf.readLine());
        int ser[] = new int[M];

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            ser[i] = Integer.parseInt(st2.nextToken());
            bw.write(binarySearch(arr,ser[i])+"\n");

        }

        bw.close();
    }
}