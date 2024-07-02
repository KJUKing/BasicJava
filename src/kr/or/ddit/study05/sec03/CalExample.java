package kr.or.ddit.study05.sec03;

import java.util.Scanner;

public class CalExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CalExample obj = new CalExample();
        double cal = obj.cal(10, 10, Operator.DIV);
        System.out.println("cal = " + cal);

    }
    public double cal(int a, int b, Operator op) {
        if(op == Operator.ADD) return add(a, b);
        if(op == Operator.SUB) return sub(a, b);
        if(op == Operator.DIV) return div(a, b);
        if(op == Operator.MUL) return mul(a, b);
        if(op == Operator.GOP) return gop(a, b);
        System.out.println("해당 연산자는 지원하지 않습니다.");
        return 0;
    }


    // 파라미터 a,b
    // +
    public double add(int a, int b) {
        return a+b;
    }

    public double sub(int a, int b) {
        return a-b;
    }

    public double div(int a, int b) {
        return a/b;
    }

    public double mul(int a, int b) {
        return a*b;
    }

    public double gop(int a, int b) {
        return a%b;
    }
}
