package Four;

public class Exercise4_6 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++) //1부터 6까지 i 값을 반복하는 외부 루프
            for(int j=1;j<=6;j++)  //1부터 6까지 j 값을 반복하는 내부 루프
                if(i+j==6)  //i+j값이 6인지 확인하는 조건문
                    System.out.println(i+"+"+j+"="+(i+j));
    }
}
