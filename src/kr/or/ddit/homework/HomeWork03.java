package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork03 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork03 obj = new HomeWork03();
        obj.process();

    }

    public void process() {

        method1();
//        method2();
    }

    public void method1() {
        // question 변수에 랜덤한 숫자
        // 1~50 숫자가 입력되어있다.
        // if문안에 ?물음표를 완성하여 해당 숫자를 맞추는 프로그램을 완성하시오.
        // 1번 시행시 cnt 값 증가

        // Math.random()
        // 0~0.9999999 까지의 double 값

        int ran = (int) (Math.random() * 50) + 1;
        int cnt = 0;
        while (true) {
            System.out.println("정수를 입력 하세요");
            System.out.println("카운트 횟수 : " + cnt);
            ++cnt;
            int ans = sc.nextInt();
            if (ans == ran) {
                System.out.println("정답입니다.");
                break;
            }
            if (ans > ran) {
                System.out.println("더 적은 수를 입력하세요");
            }
            if (ans < ran) {
                System.out.println("더 큰 수를 입력하세요");
            }

        }
        System.out.println("총" + cnt+"회 시행 되었습니다.");
    }

    public void method2() {
        // 4년마다 윤년
        // 100년 단위는 윤년 아님
        // 400년 단위는 윤년

        //1993 평 1992 윤 1900 평 2000 윤
        System.out.println("년도를 입력 하세요");
        int year = sc.nextInt();

        boolean four = year % 4 == 0;
        boolean hund = year % 100 == 0;
        boolean fourhund = year % 400 == 0;
//        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0){
//            System.out.println("윤년입니다.");
        if (fourhund || (four && !hund)) {
            System.out.println("윤년입니다.");
        }
        else {
            System.out.println("평년입니다.");
        }
    }
}

