import java.io.*;
import java.util.*;

public class Main {
    // 10845 큐
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        //Queue<Integer> q = new LinkedList<>();
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String[] p = bf.readLine().split(" ");
            switch (p[0]){
                case "push":
                    q.add(Integer.parseInt(p[1]));
                    break;
                case "pop":
                    try{
                        bw.write(Integer.toString(q.remove()));
                        bw.write("\n");
                        break;
                    }
                    catch (NoSuchElementException | NullPointerException e){
                        bw.write("-1\n");
                        break;
                    }
                case "size":
                    bw.write(Integer.toString(q.size()));
                    bw.write("\n");
                    break;
                case "empty":
                    if(q.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    try{
                        bw.write(Integer.toString(q.peekFirst()));
                        bw.write("\n");
                        break;
                    }
                    catch(NoSuchElementException | NullPointerException e){
                        bw.write("-1\n");
                        break;
                    }
                case "back":
                    try{
                        bw.write(Integer.toString(q.peekLast()));
                        bw.write("\n");
                        break;
                    }
                    catch(NoSuchElementException | NullPointerException e){
                        bw.write("-1\n");
                        break;
                    }

            }
        }
        bw.close();
    }
}