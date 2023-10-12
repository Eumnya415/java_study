package Four;

public class Exercise4_12 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++) {  // 바깥쪽 for 루프 : 1부터 9까지 반복
            for(int j=1; j<=3; j++) {  // 안쪽 for 루프 : 1부터 3까지 반복
                int x = j + 1 + (i - 1) / 3 * 3;  // x는 현재 출력할 구구단의 단 숫자를 계산함
                //i가 4,5,6이면 x는 5,6,7이 됨
                int y = i % 3 == 0 ? 3 : i % 3;  // y는 i값을 기반으로 한 숫자를 계산, i가 3,6,9인 경우 y는 항상 3

                if (x > 9)  //x가 9를 초과하면 멈춤
                    break;

                System.out.print(x + "*" + y + "=" + x * y + "\t");
            }
            System.out.println(); // 각 구구단 세트가 끝나면 줄바꿈
            if(i%3==0) System.out.println();  //3의 배수가 되는 i값(3,6,9)에서 추가 줄바꿈



            }
        }
    }

