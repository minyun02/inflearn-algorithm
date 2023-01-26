package programmers;

import java.util.Arrays;
import java.util.Optional;

public class UnfinishedRunner01 {
    String[] part = {"leo", "kiki", "eden"};
    String[] comp = {"eden", "kiki"};
//    public String[] part = {"mislav", "stanko", "mislav", "ana"};
//    public String[] comp = {"stanko", "ana", "mislav"};
    String answer = "";

    public String solution() {
        //해시를 사용하지 않고
        //참가자를 하나씩 꺼내서 완주 목록에 있는지를 확인하고 없으면 answer에 담아서 return
        for(String runner : part) {
            Optional<String> result = Arrays.stream(comp).filter(s -> s.equals(runner)).findAny();
            if(result.isEmpty()) {
                answer = runner;
            }
        }
        return answer;
        /*
            동명이인이 있는 테스트 케이스를 통과하지 못했다.
        */
    }

    public String solutionUsingHash() {

        return "";
    }
}
