package Four;

public class Exercise4_9 {
    public static void main(String[] args) {
        String str = "12345";  //문자열 생성 후 초기화
        int sum = 0;  //합계를 저장할 변수를 초기화

        for(int i=0; i<str.length(); i++) {  //반복문 : 각 문자를 순회하며 합계 계산
            sum += str.charAt(i) - '0';   // 현재 인덱스의 문자를 가져와서 문자를 숫자로 변환하여 합계에 추가함.
        }   // 문자 '0'을 빼는 것은 ASCII 값으로 숫자로 변환하는 작업

        System.out.println("sum="+sum);
    }
}
