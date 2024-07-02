package kr.or.ddit.sec03;

import java.util.Scanner;

public class CastExample02 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CastExample02 obj = new CastExample02();
        obj.process();

    }

    public void process() {
//        // 자동 형 변환: 프로그램 실행 중 자동으로 변하는 형변환
//                        작은 허용범위 타입 -> 큰 허용 범위 타입
//                        (byte<short<int<long<float<double)
        byte b = 100;
        short sh = b;
        int i = sh;
        long l = i;

        float f = l;
        double d = f;

        System.out.println("d = " + d);

        char ch = 'a';
//        byte b1 = ch;
//        short s1 = ch;
        int i1 = ch;

//        char ch2  = b;
        long l2 = 10+7;
    }
}