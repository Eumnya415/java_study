package Ch5;

public class Exercise5_8 {
    public static void main(String[] args) {
        int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
        int[] counter = new int[4];

        for(int i=0; i<answer.length; i++) {
            counter[answer[i]-1]++; //크기는 4이지만 배열의 index는 0~3이기 때문에 answer[i]에서 1을 빼주어야 함
        }

        for(int i=0; i<counter.length; i++) {
            System.out.print(counter[i]);

            for(int j=0; j<counter[i]; j++) {
                System.out.print("*"); // counter[i]의 값 만큼 '*'을 찍는다.
            }

            System.out.println();
        }
    }
}
