package onboard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;

        String string = number.toString();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<string.length(); i++){
            list.add(Integer.parseInt(string.substring(i,i+1))); // string을 다시 int로 변환하여 list에 추가
        }

        list.sort(Comparator.naturalOrder()); // sort 메서드 이용하여 정렬

        for(int i=0; i<list.size(); i++){
            answer += (int)(list.get(i) * Math.pow(10, i)); // 최종적으로 i자리 수를 만들기 위해 get(i)로 구한 수 * 10^i
        }

        return answer;
    }
}
