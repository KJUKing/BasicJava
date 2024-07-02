package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class CalExample02 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        CalExample02 obj = new CalExample02();
        obj.process();

    }

    public void process() {

        System.out.println("숫자 입력");
        int a = sc.nextInt();

        System.out.println("숫자 입력");
        int b = sc.nextInt();

        System.out.println("연산자 입력");
        String op = sc.next();

        double cal = cal(a, b, op);

        System.out.println("계산 결과값 : " + cal);

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

    public double cal(int a, int b, String op) {
        if(op.equals("+")) return method1(a, b);
        else if (op.equals("-")) return method2(a, b);
        else if (op.equals("*")) return method3(a, b);
        else if (op.equals("/")) return method4(a, b);
        else {
            System.out.println("해당 연산자는 지원하지 않습니다.");
        }

        return 0;
    }
}