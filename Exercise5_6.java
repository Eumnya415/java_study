package Ch5;

public class Exercise5_6 {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};
        //동전 단위를 저장하는 배열 coinUnit을 선언하고 초기화

        int money = 2680; //거스름돈으로 사용할 금액 설정
        System.out.println("money"+money);

        //반복문을 사용하여 각 동전 단위별로 필요한 동전의 개수를 계산하고 출력
        //루프는 coinUnit 배열의 길이만큼 반복됨
        for(int i=0; i<coinUnit.length; i++) {

            System.out.println(coinUnit[i]+"원: " +money/coinUnit[i]);
            //현재 동전 단위 coinUnit[i]와 해당 동전 단위로 거스름돈을 나눈 결과를 출력함.

            money = money%coinUnit[i];
            //현재 동전 단위로 거스름돈을 나눈 나머지를 money 변수에 저장함.

        }
    }
}
