package Four;

public class Exercise4_7 {
    public static void main(String[] args) {
        // 1. Math.random()은 0.0 이상 1.0 미만의 난수(랜덤 소수)를 생성
        //    예를 들어, 0.0 <= Math.random() < 1.0

        // 2. Math.random()에 6을 곱하면 0.0 이상 6.0 미만의 난수를 얻음
        //    예를 들어, 0.0 <= Math.random() * 6 < 6.0

        // 3. (int)를 사용하여 소수 부분을 버리고 정수로 변환
        //    결과는 0, 1, 2, 3, 4, 5 중 하나가 됨

        // 4. 3번에서 얻은 값에서 1을 더하여 범위를 1부터 6으로 만듬
        //    결과는 1, 2, 3, 4, 5, 6 중 하나가 됨
        int value = (int) (Math.random() * 6) + 1;

        // 5. 변수 value에 저장된 난수 값을 화면에 출력
        System.out.println("value:" + value);
    }
}