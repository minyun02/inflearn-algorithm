package Greedy;

public class Greedy01 {
    /*
    1이될때까지
    1. N에서 1을 뺀다.
    2. N을 K로 나눈다.
    단, 두번째 연산은 N이 K로 나누어 떨어질 때만 선택 가능

    입력 조건 : 1 <= N <= 100,000, 2<= K <= 100,000, 자연수
    출력 조건 : N이 1이 될 때까지의 최소 횟수값을 구한다.
    */
    public static void main(String[] args) {
        int n = 26;
        int k = 5;
        int i = 0;

        while(true) {
            if(1 == n) break;
            //n이 k의 배수인지 확인한다.
            if(n % k == 0) {
                //맞으면 나눈값이 최소 횟수
                i += n / k;
                n = 1;
            } else {
                //아니면 -1을하고 다시 배수인지 확인한다.
                n = --n;
                i++;
            }
        }
        System.out.println("최소 횟수는 = " + i);
    }
}
