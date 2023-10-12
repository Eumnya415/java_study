package Four;

public class Exercise4_8 {
    public static void main(String[] args) {
        for(int x=0; x<=10; x++) {   // x를 0부터 10까지 증가시키는 반복문
            for(int y=0; y<=10; y++) {  // y를 0부터 10까지 증가시키는 반복문
                if(2*x+4*y==10) {   // 2x+4y가 10과 같다면 조건이 충족됨
                    System.out.println("x="+x+", y="+y);
            }

            }
        }
    }
}
