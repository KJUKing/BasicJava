package kr.or.ddit.study03;

import java.util.Scanner;

public class BinaryOperator {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BinaryOperator obj = new BinaryOperator();
        obj.process();

    }

    public void process() {
//        method1();
//        method2();
//        method3();
//        method4();
//        method5();
        method6();
    }

    public void method1() {
//        이항연산자
        int a = 5;
        int b = 3;

        System.out.println("덧셈 = " + (a + b));
        System.out.println("뺄셈 = " + (a - b));
        System.out.println("곱셈 = " + (a * b));
        System.out.println("나눗셈 = " + (a / b));
        System.out.println("나머지 = " + (a % b));
    }

    public void method2() {
//        관계 연산자
        int a = 5;
        int b = 3;

        if (a > b) {
            System.out.println("a가 b보다 크다");

        }

        if (a >= b) {
            System.out.println("a가 b보다 크거나 같다");
        }

        if (1 == 1) {
            System.out.println("두 값이 같다");
        }

        if (a != b) {
            System.out.println("두 값이 다르다");

        }
    }

    public void method3() {

        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);

        System.out.println(a&&!b);
        System.out.println(!(a&&b));
        System.out.println(!(a||b));

        int num1 = 10;
        int num2 = 7;

        System.out.println((num1 < num2) || (num1 != num2));
    }

    public void method4() {

        int a = 5;
        int b = 3;

        int result = a+b;
        System.out.println("result = " + result);

        System.out.println("a=a+b => a+=b "+(a+=b));
        System.out.println("a=a-b => a-=b "+(a-=b));
        System.out.println("a=a*b => a*=b "+(a*=b));
        System.out.println("a=a/b => a/=b "+(a/=b));
        System.out.println("a=a%b => a%=b "+(a%=b));

        a += 13;
        System.out.println("a = " + a);


        //a 스캐너로 입력된 값을 빼세요
        System.out.print("값입력");
        int i = sc.nextInt();
        System.out.println(a -= i);
    }

    public void method5() {

        // 45 : 00101101
        // 25 : 00011001
        int a = 45;
        int b = 25;
        System.out.println(a & b);
        System.out.println(a | b);

    }

    public void method6() {
        System.out.println(12>>2);
        System.out.println(12<<2);

    }
}