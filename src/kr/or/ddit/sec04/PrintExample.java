package kr.or.ddit.sec04;

import java.util.Scanner;

public class PrintExample {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PrintExample obj = new PrintExample();
        obj.process();

    }

    public void process() {
//        method1();
//        method2();
          method3();
    }

//    public void method1() {
//        System.out.println(); 줄바꿈 기능있음
//        System.out.println("홍길동");
//        System.out.println("34061");
//        System.out.println("대전시 중구 계룡로");
//
//    }

    public void method2() {
//        System.out.print(); 줄바꿈 기능없음
        System.out.print("홍길동\t");
        System.out.print("34061\t");
        System.out.print("대전시 중구 계룡로");

    }

    public void method3() {
//        System.out.printf("형식지정 문자열", 변수 리스트);
//    "형식지정 문자열"
//    "%[[-|0n]d 10진 정수"
//    - : 왼쪽정렬
//    0 : 남은 왼쪽 빈공간에 0 채움
        System.out.printf("숫자 : %d 입니다. \n", 1000);
        System.out.printf("숫자 : %8d \n", 1000);
        System.out.printf("숫자 : %-8d \n", 1000);
        System.out.printf("숫자 : %08d \n. ", 1000);


    }


}