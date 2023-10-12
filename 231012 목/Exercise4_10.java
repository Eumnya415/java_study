package Four;

public class Exercise4_10 {
    public static void main(String[] args) {
        int num = 12345;  // 정수 변수 'num' 선언, 12345로 초기화
        int sum = 0;  // 합계를 저장할 정수 변수 'sum'을 초기화

        while (num>0) {   //num 변수가 양수인 동안 반복하는 while 루프 사용
            sum += num%10;   //'num' 변수의 일의 자리 숫자를 추출하여 합계에 더하기
            num /= 10;  //num의 일의 자리 숫자를 제외한 나머지 숫자를 얻음
        }
        // 이 과정을 통해 'num' 변수는 한 자릿수씩 줄어들고, 해당 자릿수는 'sum'에 누적
        // 다음 반복에서 'num'은 더 이상 일의 자리 숫자가 없을 때까지 위 과정을 반복


        System.out.println("sum="+sum);
    }
}
