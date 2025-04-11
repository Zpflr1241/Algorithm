import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            q.add(i);
        }
        while(q.size() > 1){
            q.remove();
            if(q.size() == 1) break;
            int tmp = q.remove();
            q.add(tmp);
        }
        System.out.println(q.remove());
    }
}