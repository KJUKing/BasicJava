package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomalOperator {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TrinomalOperator obj = new TrinomalOperator();
        obj.process();

    }

    public void process() {
//        method1();
        method2();

    }


    public void method1() {
        System.out.println("나이를 입력해 주세요");
        int age = sc.nextInt();

        String message = (age >= 18) ? "성년" : "미성년";
        System.out.println(message);
    }

    public void method2() {
        System.out.println("값을 입력하세요");
        int i = sc.nextInt();
        int message = (i % 2 == 1) ? i * 10 : i * i;
        System.out.println("결과 값 = " + message);
    }
}
