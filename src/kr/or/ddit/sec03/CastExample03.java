package kr.or.ddit.sec03;

import java.util.Scanner;

public class CastExample03 {


    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CastExample03 obj = new CastExample03();
        obj.process();

    }

    public void process() {
//        강제 타입변환
//        큰 허용 범위 타입 -> (큰 허용범위 타입)작은 허용범위 타입
//        short a = (short)(10+3)

        short s1 = 10;
        short s2 = (short) (s1 + 10);

        double d1 = 10.5;
        // d1값을 i1에 넣어보기
        int i1 = (int) d1;
        System.out.println("i1 = " + i1);

        int i2 = 80;
        // char에 넣어보기
        char c2 = (char) i2;
        System.out.println("c2 = " + c2);
        char c3 = (char) (c2 + 1);
        System.out.println("c3 = " + c3);

        // a 알파벳 값이랑 A 알파벳 값 숫자로 변환
//        char c4 = 'a';
//        char c5 = 'A';
//
//        int i3 = c4;
//        int i4 = c5;
        int i3 = 'a';
        int i4 = 'A';

        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);

        char c4 = 'a';
        char c5 = (char)(c4 - 32);
        System.out.println("c5 = " + c5);
    }
}
