package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample03 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MethodExample03 obj = new MethodExample03();
        obj.a =10;
        obj.b =30;
        obj.method1();
    }

    int a;
    int b;

    public void method1() {
        System.out.println("a = " + a);
        MethodExample03 obj1 = new MethodExample03();
        obj1.method2();
        obj1.a =2;
        obj1.method2();
    }

    public void method2() {
        System.out.println("b = " + b);
    }

}