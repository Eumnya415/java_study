package Ch5;

/*주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램*/

public class Exercise5_11 {
    public static void main(String[] args) {
        // 2차원 배열 score 선언 및 초기화
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };

        //결과를 저장할 2차원 배열 result 선언 및 초기화
        int[][] result = new int[score.length+1][score[0].length+1];

        //score 배열의 값을 result 배열에 복사하고, 각 행 및 열의 합을 계산
        for(int i=0; i<score.length; i++) {
            for(int j=0; j<score[i].length; j++) {
                result[i][j] = score[i][j];

                //result[i][j] 대신 score[i][j]를 사용해도 같은 결과를 얻음
                result[i][score[0].length] += result[i][j]; //행 합 계산
                result[score.length][j] += result[i][j]; //열 합 계산
                result[score.length][score[0].length] += result[i][j]; //전체 합 계산
            }
        }


        //결과 출력
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
                //%4d 형식 지정자 : 각 숫자를 4자리 숫자로 표시하고 필요한 경우 공백으로 채움
            }
            System.out.println(); //각 행 출력 후 줄바꿈
        }
    }
}
