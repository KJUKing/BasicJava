package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample02 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MethodExample02 obj = new MethodExample02();
        obj.process();

    }

    public void process() {
       int m1 = method1();
        System.out.println("m1 = " + m1);
       double m2 = method2();
        System.out.println("m2 = " + m2);
       String m3 = method3();
        System.out.println("m3 = " + m3);
       method4();

    }

    public int method1() {
        System.out.println("리턴 타입이 int인 메소드");
        return 10;
    }
    public double method2() {
        System.out.println("리턴 타입이 double인 메소드");
        return 20;
    }
    public String method3() {
        System.out.println("리턴 타입이 String인 메소드");
        return "문자열";
    }
    public void method4() {
        System.out.println("리턴 타입이 없는 메소드");
    }


}