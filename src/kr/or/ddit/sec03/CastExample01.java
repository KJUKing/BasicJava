package kr.or.ddit.sec03;

import java.util.Scanner;

public class CastExample01 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CastExample01 obj = new CastExample01();
        obj.process();

    }

    public void process() {
//        System.out.println("숫자를 입력하세요");
//        String str = sc.next();
//        System.out.println("입력한 결과 값 = " + str);
        int kor = 80;
        int eng = 75;
        int math = 77;

        // 총점과 평균 출력하기

        int sum = kor + eng + math;
        double avg = (double) sum/3;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
