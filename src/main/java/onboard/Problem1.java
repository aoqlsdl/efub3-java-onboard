package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();

        // 45분 앞당기기
        minute -= 45;

        // minute 값이 0보다 작으면 minute에 +60, hour -1
        if(minute<0) {
            hour--;
            minute += 60;
        }
        // hour 값이 0보다 작으면 hour에 +24
        if(hour<0) hour = 24+hour;

        answer.add(hour);
        answer.add(minute);

        return answer;
    }
}
