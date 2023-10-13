package Ch5;

public class Exercise5_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // 정수형 배열 arr을 선언하고 초기화
        int sum = 0;  //배열 요소들을 더한 결과를 저장할 변수 sum을 초기화

        /* for 루프 사용, int i=0으로 시작해서 i가 arr.length보다 작을 때까지 반복하며,
        반복문이 한번 실행될 때마다 i를 1씩 증가시킴.*/
        for(int i=0; i<arr.length; i++) {

            //각 반복에서 현재 i에 해당하는 배열 arr의 요소를 가져와서 sum 변수에 더함.
            sum+= arr[i];
        }
        System.out.println("sum=" +sum);
    }
}
