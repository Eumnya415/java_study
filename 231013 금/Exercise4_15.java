package Four;

public class Exercise4_15 {
    public static void main(String[] args) {
        int number = 12321; // 주어진 숫자를 정수형 변수 number에 저장

//원래 숫자를 변경하지 않고, 숫자를 뒤집어서 비교하기 위한 임시 변수 tmp에 숫자를 복사함
        int tmp = number;

        int result = 0; // 결과를 저장할 변수 result 초기화

// tmp 변수가 0이 될 때까지 숫자를 뒤집는 과정을 반복하는 while 루프
        while(tmp !=0) {

// result 변수에 현재 결과에 10을 곱하고, tem의 1의 자리 숫자를 더함
            result = result*10 + tmp % 10;
            tmp /= 10; //tmp를 10으로 나누어 일의 자리 숫자를 제거함.
            //변수의 일의 자리 숫자가 제거되고, 십의 자리 숫자가 일의 자리로 이동함
        }

        if(number == result)  //원래 숫자와 뒤집은 숫자가 같은지 비교
            System.out.println(number + "는 회문수입니다.");
        else
            System.out.println(number + "는 회문수가 아닙니다.");
    }
}
