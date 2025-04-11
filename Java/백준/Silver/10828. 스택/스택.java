import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    // 10828 스택
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] p = bf.readLine().split(" ");
            switch (p[0]){
                case "push":
                    stack.push(Integer.parseInt(p[1]));
                    break;
                case "pop":
                    try{
                        bw.write(Integer.toString(stack.pop()));
                        bw.write("\n");
                        break;
                    }
                    catch (EmptyStackException e){
                        bw.write("-1\n");
                        break;
                    }
                case "size":
                    bw.write(Integer.toString(stack.size()));
                    bw.write("\n");
                    break;
                case "empty":
                    if(stack.empty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "top":
                    try{
                        bw.write(Integer.toString(stack.peek()));
                        bw.write("\n");
                        break;
                    }
                    catch(EmptyStackException e){
                        bw.write("-1\n");
                        break;
                    }
            }
        }
        bw.close();
    }
}
