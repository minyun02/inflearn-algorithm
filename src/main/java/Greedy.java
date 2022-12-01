import java.util.Arrays;
import java.util.Comparator;

public class Greedy {

    public static int arrangeMeetingRoom(int[][] schedule) {
        System.out.println(Arrays.deepToString(schedule));
        //회의 종료 시간으로 정렬
        Arrays.sort(schedule, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
//                System.out.println("o1="+o1[0]+"   o1="+o1[1]);
//                System.out.println("o2="+o2[0]+"   o2="+o2[1]);

                // 종료시간이 같은 경우 시작시간이 빠른순으로 정렬한다.
                if(o1[1] == o2[1]) return o1[0] - o2[0];

                return o1[1] - o2[1];
            }
        });
        System.out.println(Arrays.deepToString(schedule));

        int count = 0;
        int prevEndTime = 0;
        String msg = "회의실 이용 시간 = ";

        for(int i = 0; i < 5; i++) {
            //직전 종료시간이 다음 회의 시작 시간보다 작거나 같으면 갱신
            if(prevEndTime <= schedule[i][0]) {
                prevEndTime = schedule[i][1];
                count++;
                msg += "("+schedule[i][0] + ", " + schedule[i][1]+"), ";
            }
        }
        System.out.println(msg);
        return count;
    }
}
