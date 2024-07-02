package kr.or.ddit.study06.sec04;

public class Circle {

    double pi = Math.PI;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1의 넓이 = " + c1.method1(5.5));

        Circle c2 = new Circle();
        System.out.println("c2의 둘레 = " + c2.method2(5.6));

    }
    //넓이 구하는 메소드만들기
    //return 넓이, 파라미터 반지름
    //넓이 = pi * 반지름 * 반지름

    // 둘레 구하는 메소드만들기
    // return 둘레, 파라미터 반지름
    // 둘레 = pi * 반지름 *2

    public double method1(double a) {
        return pi * a * a;
    }

    public double method2(double b) {
        return pi * b * 2;
    }
}
