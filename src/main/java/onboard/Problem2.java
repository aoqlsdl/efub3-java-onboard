package onboard;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards) {
        Integer[] answer = {};

        // integer 배열 설정
        answer = new Integer[20];

        int a = 0;
        int b = 0;
        int now = 0;

        for (int i = 0; i < 20; i++)
            answer[i] = i + 1;


        for (int i = 0; i < 10; i++) {
            a = flipCards[i][0] - 1;
            b = flipCards[i][1] - 1;

            if ((b-a) % 2 == 0)
                for (int j = 0; j < (b-a)/2; j++) { // 바꿔야 할 index가 홀수개라서, 중간값은 바뀔 필요 X
                    now = answer[b-j]; // flip할 부분 지정 | ex) a = 5, b = 10, j = 0일 때, 10번 index의 값을 바꾸어야 할 차례임을 선언
                    answer[b-j] = answer[j+a]; // card flip - 1 | ex) 10번 index의 값을 5번 index의 값으로 설정
                    answer[j+a] = now; // card flip - 2 | ex) 5번 index의 값을 10번 index의 값으로 설정
                }
            else
                for (int j = 0; j <= (b-a)/2; j++) { // 바꿔야 할 index가 짝수개라서, 모든 값이 서로 바뀌어야 함
                    now = answer[b-j];
                    answer[b-j] = answer[j+a];
                    answer[j+a] = now;
                }
        }
        return answer;
    }
}
