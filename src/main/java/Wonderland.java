import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Wonderland {
    static int[] parent;

    //같은 그룹인지 확인
    public static int find(int r) {
        //부모라면 반환
        if(parent[r] == r) return r;
        //재귀로 부모를 찾아간다
        return parent[r] = find(parent[r]);
    }

    //같은 그룹으로 만든다
    public static void union(int e1, int e2) {
        int a = find(e1);
        int b = find(e2);
        if(a != b) parent[a] = b;
    }

    public static int solution(ArrayList<Edge> arr) {
        int answer = 0;

        //Edge 클래스에 정의해둔 compareTo 방식으로 정렬한다. cost 오름차순
        Collections.sort(arr);

        for(Edge edge : arr) {
            if(find(edge.v1) != find(edge.v2)) {
                answer += edge.cost;
                //추가했으면 두 정점은 합쳐준다.
                union(edge.v1, edge.v2);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        parent = new int[10];
        for(int i = 1; i <= 9; i++) {
            parent[i] = i;
        }

        int[][] input = {{1, 2, 12},
                {1, 9, 25},
                {2, 3, 10},
                {2, 8, 17},
                {2, 9, 8},
                {3, 4, 18},
                {3, 7, 55},
                {4, 5, 44},
                {5, 6, 60},
                {5, 7, 38},
                {7, 8, 35},
                {8, 9, 15}
        };
        ArrayList<Edge> arr = new ArrayList<>();
        for(int i = 0; i < input.length; i++) {
            arr.add(new Edge(input[i][0], input[i][1], input[i][2]));
        }
        System.out.println(solution(arr));
    }
}

class Edge implements Comparable<Edge> {
    public int v1;
    public int v2;
    public int cost;

    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost;
    }
}
