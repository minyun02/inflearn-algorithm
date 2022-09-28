import java.util.Arrays;

public class Sorting {
    public static int[] sorting3(int[] input) {
        for(int i = 1; i < input.length; i++) {
            int tmp = input[i];
            for(int j = i-1; j >= 0; j--){
                int prevNum = input[j];
                if(tmp < prevNum) {
                    input[j+1] = prevNum;
                    input[j] = tmp;
                }
            }
        }
        return input;
    }
    public static int[] sorting4(int n, int[] input) {
        int[] answer = new int[n];

        return answer;
    }
    public static String sorting5(int[] input) {
        String answer = "U";
        Arrays.sort(input);
        for(int i = 0; i < input.length-1; i++) {
            if(input[i] == input[i+1]) {
                answer = "D";
                break;
            }
        }
        return answer;
    }
}
