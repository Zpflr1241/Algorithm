import java.io.*;
import java.util.Arrays;

public class Main {
    // 2108 통계학
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());

        //입력
        int arr[] = new int[N];
        arr[0] = Integer.parseInt(bf.readLine());
        int max = arr[0], min = arr[0];

        for (int i = 1; i < N; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            if (arr[i] >= max) max = arr[i]; //최대값 구하기
            else if (arr[i] <= min) min = arr[i]; //최소값 구하기
        }
        //-----

        int hap = 0;
        int count[] = new int[max - min + 1 ];
        for (int v : arr) {
            count[v - min]++; // 원소의 개수 카운트
            hap += v; // 원소들의 합을 구함
        }

        //
        int count_max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= count_max) {
                count_max = count[i];
            }
        }

        int mode[] = new int[N]; // 최빈값 리스트
        Arrays.fill(mode, 4001);
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == count_max) { //<- 이부분 고쳐야함. 4월 15일에 때려침....
                mode[index] = i + min;
                index++;
            }
        }
        Arrays.sort(mode);
        //System.out.println(count_max);
        //System.out.println(Arrays.toString(mode));
        int sorted[] = new int[N];
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int v : arr) {
            sorted[count[v - min] - 1] = v;
            count[v - min]--;
        }
        bw.write(Math.round((float) hap / arr.length) + "\n"); //산술평균
        bw.write(sorted[sorted.length / 2] + "\n"); // 중앙값
        bw.write((index == 1 ? mode[0] : mode[1]) + "\n"); // 최빈값
        bw.write(max + (-min) + "\n"); // 범위

        bw.flush();
    }
}