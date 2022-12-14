import java.util.Arrays;
import java.util.Comparator;

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
//        answer[0] = input[0];
//        for(int x : input) {
//            for(int i = 0; i < n; i++) {
//                if(x != answer[i]) {
//                    for(int j = i-1; j <= 0; j--) {
//                        answer[]
//                    }
//                }
//            }
//        }

        for(int x : input) {
            int index = -1; //배열에 포함되었는지 확인하는 포인터 & 없으면 -1이지만 있으면 i를 담는다(요소를 꺼낼때 쓰인다)
            for(int i = 0; i < n; i++) {
                if(x == answer[i]) index = i;
            }
            if(index == -1) {
                for(int i = n-1; i >= 1; i--) {
                    answer[i] = answer[i-1];
                }
            } else {
                for(int i = index; i >= 1; i--) {
                    answer[i] = answer[i-1];
                }
            }
            answer[0] = x;
        }
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

    public static String sorting6(int[] input) {
        String answer = "";
        int[] tmp = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            tmp[i] = input[i];
        }
        Arrays.sort(tmp);

        for(int i = 0; i < input.length; i++) {
            if(tmp[i] != input[i]) {
                answer += (i+1) + ",";
            }
        }

        return answer;
    }

    public static String sorting7(int[][] input) {
        Arrays.sort(input, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });
        return Arrays.deepToString(input);
    }
}
