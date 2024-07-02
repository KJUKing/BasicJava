package kr.or.ddit.sec03;

import java.util.Scanner;

public class CastExample05 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CastExample05 obj = new CastExample05();
        obj.process();

    }

    public void process() {
        method1();
    }

    public void method1() {
        // 국어 점수 입력 받기
        System.out.println("국어 점수 입력 : ");
        String korStr = sc.next();
        int kor = Integer.parseInt(korStr);
        System.out.println("국어 점수 : " + kor);

        System.out.println("수학 점수 입력 : ");
        String mathStr = sc.next();
        int math = Integer.parseInt(mathStr);
        System.out.println("수학 점수 : " + math);

        System.out.println("영어 점수 입력 : ");
        String engStr = sc.next();
        int eng = Integer.parseInt(engStr);
        System.out.println("영어 점수 : " + eng);

        int sum = kor + math + eng;
        double avg = sum/3.0 ;
        System.out.println("합계 : " + sum + "평균 = " + avg);
    }

}
