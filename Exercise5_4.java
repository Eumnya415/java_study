package Ch5;

public class Exercise5_4 {
    public static void main(String[] args) {
        int [][] arr = { // 2차원 정수형 배열 arr을 선언하고 초기화
                {5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
//배열 요소들의 합을 저장할 변수 total을 초기화
        int total = 0;

        // 배열 요소들의 평균을 저장할 변수 average를 초기화
        float average = 0;

        //외부 for 루프 : 2차원 배열의 행을 순회함
        for(int i=0; i<arr.length; i++) {
            //내부 for 루프 : 2차원 배열의 열을 순회함
            for(int j=0; j<arr[i].length; j++) {
                total += arr [i][j]; //각 요소의 총합
            }
        }

        average = total/(float)(arr.length * arr[0].length);
        //배열 요소들의 합인 total을 배열 요소 갯수로 나누어 평균 계산
        //float를 사용하여 정수 나눗셈에서 소수 부분 유지
        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}
