package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MethodExample obj = new MethodExample();
        obj.process();

    }

    public void process() {
        method1(10);
        method1();
        method1(10.5);
        method1(20.3, 25.4);
    }

    public void method1() {
        System.out.println("파라미터 없는 메소드");
    }
    public void method1(int a) {
        System.out.println("a = " + a);
    }

    //파라미터가 double인 method1 만들고
    //호출해보기

    public void method1(double b) {
        System.out.println("b = " + b);
    }

    public void method1(double c, double d) {
        double v = c + d;
        System.out.println("v = " + v);
    }
}