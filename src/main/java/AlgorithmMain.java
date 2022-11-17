import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmMain {
    Node root;
    static int answer = Integer.MIN_VALUE, n, m;
    public static void main(String[] args) {
        System.out.println("시작!");
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
//        System.out.println(Arrays.toString(Sorting.sorting3(new int[] {11, 7, 5, 6, 10, 9})));
//        System.out.println(Arrays.toString(Sorting.sorting4(5, new int[] {1,2,3,2,6,2,3,5,7})));
//        System.out.println(Sorting.sorting5(new int[] {20,25,52,30,39,33,43,33}));
//        System.out.println(Sorting.sorting6(new int[] {120, 125, 152, 130, 135, 135, 143, 127, 160}));
//        System.out.println(Sorting.sorting6(new int[] {120, 130, 150, 150, 130, 150}));
//        System.out.println(Sorting.sorting7(new int[][] {{2, 7}, {1, 3}, {1, 2}, {2, 5}, {3, 5}}));

//        Recursive.recursive1(3);
//        System.out.println(Recursive.recursive3(5));
//        System.out.print(Recursive.recursive4and1(10));

//        AlgorithmMain tree = new AlgorithmMain();
//        tree.root = new Node(1);
//
//        tree.root.lt = new Node(2);
//        tree.root.rt = new Node(3);
//
//        tree.root.lt.lt = new Node(4);
//        tree.root.lt.rt = new Node(5);
//        System.out.println(Recursive.recursive10(tree.root));

        //최대점수 구하기
        Recursive.findMaxSum(0, 0, 0, a, b);
        System.out.println(answer);
//        5
//        20
//        10
//        5
//        25
//        12
//        15
//        8
//        6
//        3
//        7
//        4
    }
}
