import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
}

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
