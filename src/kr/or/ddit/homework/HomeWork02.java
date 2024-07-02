package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork02 obj = new HomeWork02();
        obj.process();

    }

    public void process() {
//        method1();
//        method2();
//        method3();
        method4();
//        method5();

    }

    public void method1() {
        //스캐너를 통해서 문자를 입력받고
        //소수점 2번째자리에서 버림
        //ex) 12.23123 -> 12.23 10곱하기 나누기 10나누기로 소수점 해소

        System.out.println("문제 1번 실수 입력");
        String num = sc.next();
        double d_1 = Double.parseDouble(num);
        double d_trans = d_1 * 100;
        int i_trans = (int) d_trans;
        double d_result = (double) i_trans / 100;
        System.out.println("result = " + d_result);

        //hint
//        double a = 13.3;
//        int i1 = (int) (a);
//        int i2 = i1 + (int) ((a - i1) * 2);
//        System.out.println(i2);

    }

    public void method2() {
        // 스캐너를 통해서 대문자를 입력받고 소문자로 변환
        // ex) A -> a
        System.out.println("대문자를 입력하세요");
        String str = sc.next();
        char ch1 = str.charAt(0);
        char ch1_Lower = (char) (ch1 + 32);
        System.out.println("소문자 답 = " + ch1_Lower);

//        System.out.println("eng = " + eng);
//        char eng_Lower = (char) (eng + 32);
//        System.out.println("eng_Lower = " + eng_Lower);

    }

    public void method3() {
        // 스캐너를 통해서 소문자를 입력받고 대문자로 변환
        // ex) a -> A
        System.out.println("소문자를 입력하세요");
        String str = sc.next();
        char ch1 = str.charAt(0);
        char ch1_Upper = (char) (ch1 - 32);
        System.out.println("대문자 답 = " + ch1_Upper);

    }

    public void method4() {
        // 스캐너를 통해 숫자 3자리를 입력받고 각 자리수의 합를 구하시오
        // ex) 123 -> 1+2+3

        System.out.println("세자리 숫자를 입력해 주세요");
        String s = sc.next();
        char ch1 = s.charAt(0);
        char ch2 = s.charAt(1);
        char ch3 = s.charAt(2);

        int parse1 = Integer.parseInt(String.valueOf(ch1));
        int parse2 = Integer.parseInt(String.valueOf(ch2));
        int parse3 = Integer.parseInt(String.valueOf(ch3));

        int sum = parse1 + parse2 + parse3;

        System.out.println("sum = " + sum);


    }

    public void method5() {
        // 스캐너를 통해서 실수를 입력 받고
        // 소수점 2번째 자리에서 반올림
        // ex) 12.2623 -> 12.3

        System.out.println("실수를 입력하세요");
        String d = sc.next();
        double a = Double.parseDouble(d);
        double a_trans = a * 10;
        int i = (int)(a_trans);
        int result = i + (int) ((a_trans - i) * 2);
        double d_result = (double) result/10;
        System.out.println("result = " + d_result);

    }
}

