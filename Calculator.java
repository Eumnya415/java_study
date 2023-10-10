package ex01;

public class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;  // 덧셈 메소드
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;  // 뺄셈 메소드
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;  // 곱셈 메소드
    }

    public double divide(double num1, double num2) {  // 나눗셈 메소드
        if (num2 != 0) {  // 0으로 나눌 경우 처리
            return num1 / num2;
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
            return Double.NaN; // Not-a-Number를 반환하여 오류 표시
        }
    }
}