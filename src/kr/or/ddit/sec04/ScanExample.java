package kr.or.ddit.sec04;

import java.util.Scanner;

public class ScanExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ScanExample obj = new ScanExample();
        obj.process();
    }

    public void process() {
        System.out.println("문자 입력");
        String s = sc.next();
        System.out.println("s = " + s);

        System.out.println("정수 입력");
        int num = sc.nextInt();
        System.out.println("num = " + num);

        System.out.println("실수 입력");
        double d1 = sc.nextDouble();
        System.out.println("d1 = " + d1);

    }


}
