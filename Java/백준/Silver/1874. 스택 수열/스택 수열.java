import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    // 1874 스택 수열
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();


        int n = Integer.parseInt(bf.readLine());
        int index = 0;

        for(int i = 0 ; i < n ; i++){
            int val = Integer.parseInt(bf.readLine());

            while(val > index){
                index++;
                stack.push(index);
                sb.append("+\n");

            }
            if(stack.pop() == val){
                sb.append("-\n");
            }else{
                sb.delete(0,sb.length());
                sb.append("NO");
                break;
            }

        }
        System.out.println(sb);
    }
}