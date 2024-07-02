package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class CalExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CalExample obj = new CalExample();
        obj.process();

    }

    public void process() {
       int m1 = method1(30, 20);
        System.out.println("m1 = " + m1);
       int m2 = method2(30, 20);
        System.out.println("m2 = " + m2);
       int m3 = method3(30, 20);
        System.out.println("m3 = " + m3);
       int m4 = method4(30, 20);
        System.out.println("m4 = " + m4);

    }

    public int method1(int a, int b) {
        return a+b;
    }
    public int method2(int a, int b) {
        return a-b;
    }
    public int method3(int a, int b) {
        return a*b;
    }
    public int method4(int a, int b) {
        return a/b;
    }


}