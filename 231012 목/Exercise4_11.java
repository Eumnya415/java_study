package Four;

public class Exercise4_11 {
    public static void main(String[] args) {

        int num1 = 1;  // 첫번째 항 초기화
        int num2 = 1;  // 두번째 항 초기화
        int num3 = 0;  // 세번째 항 초기화
        System.out.print(num1+ "," +num2);  // 처음 두 항을 출력

        for(int i=0; i<8; i++) {   // 피보나치 수열을 생성하는 반복문, 앞의 두 수 1,1을 빼면 총 8회 반복
            num3 = num1 + num2;   // 다음 항은 이전 두 항의 합
            System.out.print(","+num3);  //세 번째 수열 출력

            num1 = num2;  // 두 번째 수열을 첫 번째 값으로 함
            num2 = num3;  // 세 번째 수열을 두 번째 값으로 함
        }
    }
}

