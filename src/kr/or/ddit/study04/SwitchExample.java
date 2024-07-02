package kr.or.ddit.study04;

import java.util.Scanner;

public class SwitchExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SwitchExample obj = new SwitchExample();
        obj.process();

    }

    public void process() {
        method3();
    }

    public void method1() {

        int num = 1;
        switch (num) {
            case 1:
                System.out.println("1번");
                break;
            case 2:
                System.out.println("2번");
                break;
            default:
                System.out.println("그 외 값");
                break;
        }
    }

    public void method2() {
        System.out.println("회원 등급을 입력하세요.");
        int grade = sc.nextInt();
        switch (grade) {
            case 1:
                System.out.println("VIP");
                break;
            case 2:
                System.out.println("우수");
                break;
            case 3:
                System.out.println("일반");
                break;
            default:
                System.out.println("잘못입력됨");
                break;
        }
    }

    public void method3() {
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        switch (score / 10) {
            case 9:
                System.out.println("A학점");
                break;

            case 8:
                System.out.println("B학점");
                break;

            case 7:
                System.out.println("C학점");
                break;

            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("F학점");
                break;
        }
    }

    public void method4() {
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        String grade = "";
        switch (score / 10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                switch (score % 10) {
                    case 1:
                    case 2:
                    case 3:
                        grade = "A-";
                        break;
                    case 4:
                    case 5:
                    case 6:
                        grade = "A0";
                        break;
                    case 7:
                    case 8:
                    case 9:
                        grade = "A+";
                        break;
                }
            default:
                System.out.println("F학점");
                break;
        }
    }
}
