import java.io.*;
import java.util.*;
public class Main {
	static int[] merge_sort(int[] arr) {
		if(arr.length == 1) return arr;
		int mid = arr.length / 2;
		int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
	}
	static int[] merge(int[] arr1, int[] arr2) {
		ArrayList<Integer> res = new ArrayList<>();
		int index1 = 0, index2 = 0;
		while (index1 < arr1.length && index2 < arr2.length) {
			if(arr1[index1] < arr2[index2]) {
				res.add(arr1[index1]);
				index1++;
			}
			else {
				res.add(arr2[index2]);
				index2++;
			}
		}
		if(index1 == arr1.length) {
			for(int i = index2; i < arr2.length; i++ )
				res.add(arr2[i]);
		}
		else {
			for(int i = index1; i < arr1.length; i++ )
				res.add(arr1[i]);
		}
		
		return res.stream().mapToInt(i -> i).toArray();
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO merge_sort
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		int arr[] = new int[N];
		for(int i = 0; i < N ; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		arr = merge_sort(arr);
		for(int i = 0; i < N ; i ++) {
			bw.write(arr[i]+"\n");
		}
		bw.close(); 
	}
}