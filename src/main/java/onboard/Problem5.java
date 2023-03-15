package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;

        int coins = K;

        for(int i = N-1; i >= 0; i--){
            answer += coins / values[i]; // K값을 만들기 위해 필요한 동전의 개수
            coins = coins % values[i]; // coin으로 K값 중 일부를 채우고 남은 값 계산
        }

        return answer;
    }
}
