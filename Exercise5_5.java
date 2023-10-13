package Ch5;
/* 1에서 9까지의 숫자를 포함하는 ballArr 배열을 생성함
* ballArr 배열의 숫자를 무작위로 섞고, ball3 배열에 ballArr 배열의 앞에서 3개의 요소를 복사 후
* ball3 배열의 요소 출력*/

public class Exercise5_5 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        //1부터 9까지의 숫자를 포함하는 정수 배열 ballArr 생성

        int[] ball3 = new int[3];
        //크기가 3인 정수 배열 ball3을 생성
        //나중에 ballArr 배열에서, 앞에서 3개의 요소를 복사하여 저장할 목적으로 만들어짐

        //배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        //배열 ballArr의 요소를 무작위로 섞는 작업
        for(int i=0; i<ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length); //0부터 8 사이의 무작위 숫자 생성
            //Math.random() 메소드를 사용하여 무작위로 정수 j를 선택함

            int tmp = 0;
            //배열 요소를 교환하기 위해서 임시 변수 tmp를 사용

            tmp = ballArr[i]; // 현재 요소를 임시 변수에 복사
            ballArr[i] = ballArr[j]; // 현재 요소를 무작위 요소로 교체
            ballArr[j] = tmp; // 무작위 요소를 임시 변수에서 복사한 값으로 교체
        }

        //배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
        System.arraycopy(ballArr,0, ball3,0,3);

        for(int i=0; i<ball3.length; i++) {
            System.out.print(ball3[i]);
            //배열 ball3의 요소를 출력함
        }
        System.out.println();
    }
}
