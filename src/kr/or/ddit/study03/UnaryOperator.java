package kr.or.ddit.study03;

import java.util.Scanner;

public class UnaryOperator {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            UnaryOperator obj = new UnaryOperator();
            obj.process();

    }

    public void process() {
        method1();
        method2();
        method3();
    }

    public void method1() {
            int num = -100;
            int res = -num;

        System.out.println("num = " + num);
        System.out.println("res = " + res);
    }

    public void method2() {
        // 증감 연산자
        // ++변수 : 다른 연산을 수행하기 전에 1을 증가시킴
        // 변수++ : 다른 연산을 수행한 후에 1을 증가시킴
        // --변수 : 다른 연산을 수행하기 전에 1을 감소시킴
        // 변수-- : 다른 연산을 수행한 후에 1을 감소시킴

        int value = 10;
        int res = 0;

        res =  ++value;
        System.out.println("value = " + value);
        System.out.println("res = " + res);

        value = 10;
        res =  value++;
        System.out.println("value = " + value);
        System.out.println("res = " + res);

        value = 10;
        res =  --value;
        System.out.println("value = " + value);
        System.out.println("res = " + res);

        value = 10;
        res =  value--;
        System.out.println("value = " + value);
        System.out.println("res = " + res);

    }

    public void method3() {
        String str = "12345";
        int num  = 0;

        char c1 = str.charAt(num++);
        char c2 = str.charAt(num++);
        char c3 = str.charAt(num++);
        char c4 = str.charAt(num++);
        char c5 = str.charAt(num++);
        System.out.println(c1 +" , " +c2 +" , " +c3 +" , " +c4 +" , " +c5);

        num = 10;
        System.out.println(num+++10);
        System.out.println(++num+10);
    }
}


