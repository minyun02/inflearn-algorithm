import java.util.Arrays;

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
}
