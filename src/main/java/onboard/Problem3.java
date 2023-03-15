package onboard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();

        int average = 0;
        int mid = 0;
        int sum = 0;

        // 모든 값의 합
        for(int i=0;i<5;i++) {
            sum+=numbers.get(i);
        }

        // sort 메소드를 이용하여 정렬
        numbers.sort(Comparator.naturalOrder());

        average = sum / 5;

        // get 메소드를 이용하여 해당 리스트의 2번 인덱스(중간)에 존재하는 요소를 반환
        mid = numbers.get(2);

        answer.add(0,average);
        answer.add(1, mid);

        return answer;
    }
}
