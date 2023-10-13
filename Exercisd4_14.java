package Four;

import com.sun.security.jgss.GSSUtil;

public class Exercisd4_14 {
    public static void main(String[] args) {

/* Maty.random() : 메소드를 사용하여 0부터 1 사이의 난수를 생성하고,
이를 1부터 100 사이의 난수로 변환하기 위해 곱하고 1을 더하여 answer 변수에 저장 */
        int answer = (int) (Math.random() * 100) +1;
        int input = 0;  //사용자 입력 및 시도 횟수를 저장하는 변수를 초기화
        int count = 0;

/* 사용자 입력을 받기 위해 'java.util.Scanner' 객체를 생성하고,
System.in을 사용하여 표준 입력을 읽을 수 있도록 함 */
        java.util.Scanner s = new java.util.Scanner(System.in);

//do-while 루프를 사용하여 게임 반복. 사용자가 정답을 맞히면 루프 종료
        do {
            count++; // count 변수를 사용하여 시도 횟수 추적, 각 시도에서 횟수를 1 증가시킴
            System.out.println("1과 100 사이의 값을 입력하세요 :"); // 출력
            input = s.nextInt(); // 정수 입력을 받아 input 변수에 저장

//if-else if-else 조건문을 사용하여 사용자 입력값과 정답을 비교하고, 그에 따라 사용자에게 힌트 메시지 출력
            if (answer > input) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다."); // 정답을 맞혔을 때 실행
                System.out.println("시도 횟수는 " + count + "번입니다.");
                break; // 정답을 맞히면 무한루프 종료
            }
        } while(true); // 무한루프를 나가면 프로그램 종료

    }
}
