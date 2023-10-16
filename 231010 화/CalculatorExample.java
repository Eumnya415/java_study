package ex01;
import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in); //scanner 객체 생성

        System.out.println("사칙연산 계산기를 시작합니다.");
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble(); // 첫 번째 숫자 입력

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble(); // 두 번째 숫자 입력

        System.out.print("연산을 선택하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // 연산자 입력

        double result = 0.0; // 연산 결과를 저장할 변수

        switch (operator) {
            case '+':
                result = calculator.add(num1, num2); // 덧셈
                break;
            case '-':
                result = calculator.subtract(num1, num2); // 뺄셈
                break;
            case '*':
                result = calculator.multiply(num1, num2); // 곱셈
                break;
            case '/':
                result = calculator.divide(num1, num2); // 나눗셈
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
                return; // 프로그램 종료
        }

        System.out.println("결과: " + result); // 연산 결과 출력

        scanner.close();
    }
}
