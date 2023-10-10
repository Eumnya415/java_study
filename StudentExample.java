package ex01;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");
        // Student 클래스의 객체 생성 및 변수 s1에 할당

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
        // 또 다른 Student 클래스의 객체 생성 및 변수 s2에 할당
    }
}
