import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Recursive {
    public static void recursive1(int n) {
        if(n==0) return;
        else {
            recursive1(n-1);
            System.out.println(n+" ");
        }
    }

    public static int recursive3(int n) {
        if(n == 1) return 1;
        else {
            System.out.println("n = " + n);
            return n * recursive3(n-1);
        }
    }

    public static int recursive4and1(int n) {
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else return recursive4and1(n-2) + recursive4and1(n-1);
    }

    public static int recursive10(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len; i++) {
                Node current = q.poll();
                if(current.lt == null && current.rt == null) return level;
                if(current.lt != null) q.offer(current.lt);
                if(current.rt != null) q.offer(current.rt);
            }
            level++;
        }
        return 0;
    }

    public static void findMaxSum(int level, int sum, int time, int[] ps, int[] pt){
        int m = AlgorithmMain.m;
        int n = AlgorithmMain.n;

        if(time > m) return; //지금까지 선택한 문제들을 푸는데 걸리는 시간이 제한 시간m보다 크면 끝
        if(level == n) {//
            AlgorithmMain.answer = Math.max(AlgorithmMain.answer, sum);
        } else {
            findMaxSum(level + 1, sum+ps[level], time + pt[level], ps, pt);
            findMaxSum(level + 1, sum, time, ps, pt);
        }
    }
}

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
