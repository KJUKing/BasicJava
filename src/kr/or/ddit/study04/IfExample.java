package kr.or.ddit.study04;

import java.util.Scanner;

public class IfExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        IfExample obj = new IfExample();
        obj.process();

    }

    public void process() {
//        method1();
//        method2();
//        method3();
//        method4();
//        method5();
//        method6();
//        method7();
        method8();
    }


    public void method1() {
        if (true) {
            System.out.println("조건식이 참");

        }
        System.out.println("실행문...");
    }

    public void method2() {
        System.out.println("정수를 입력하세요");
        int i = sc.nextInt();
        if (i >= 60) {
            System.out.println("합격입니다");

        } else {
            System.out.println("불합격입니다");
        }
    }

    public void method3() {
        // 12, 1, 2월 겨울
        // 3, 4 ,5 봄
        // 6, 7, 8 여름
        // 9, 10, 11 가을

        System.out.println("월을 입력하세요");
        int i = sc.nextInt();
        if (i == 1 || i == 2 || i == 12) {
            System.out.println("겨울입니다.");
        } else if (i == 3 || i == 4 || i == 5) {
            System.out.println("봄입니다.");
        } else if (i == 6 || i == 7 || i == 8) {
            System.out.println("여름입니다.");
        } else if (i == 9 || i == 10 || i == 11) {
            System.out.println("가을입니다.");
        } else {
            System.out.println("1~12 밖의 숫자를 입력했습니다.");
        }
    }

    public void method4() {
        // 점수를 입력받아 학점출력 90 a 90 80 b 80 70 c 70 60 d 60 f
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("A학점");
        } else if (score < 90 && score >= 80) {
            System.out.println("B학점");
        } else if (score < 80 && score >= 70) {
            System.out.println("C학점");
        } else if (score < 70 &&  score >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }
    }

    public void method5() {
        // 점수를 입력받아 학점출력 90 a 90 80 b 80 70 c 70 60 d 60 f
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else if (score >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }
    }

    public void method6() {
        // 키와 체중을 입력하여 bmi 지수를 구하고 지수에따른
        // 정상 과체중 비만 고도비만 정보 출력
        // 0 18.4 저체중 / 18.5 22.9 정상 / 23.0 29.9 비만
        // 30 이상 고도비만

        //bmi 지수 = 체중 /(키*키)

        System.out.println("키와 체중을 입력하시오");
        System.out.print("키 : ");
        int height = sc.nextInt();
        double d_height = (double)height / 100;
        System.out.print("체중 : ");
        int weight = sc.nextInt();

        double bmi = weight / (d_height * d_height);

        if (bmi <= 18.4) {
            System.out.println("bmi는 "+ bmi + " 저체중입니다");
        } else if (bmi <= 22.9) {
            System.out.println("bmi는 "+ bmi + " 정상입니다");
        } else if (bmi <= 29.9) {
            System.out.println("bmi는 "+ bmi + " 비만입니다");
        } else {
            System.out.println("bmi는 "+ bmi + " 고도비만입니다");
        }
    }

    public void method7() {
        System.out.println("A");
        if (true) {
            System.out.println("B");
            if (false) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
        else System.out.println("E");

        System.out.println("F");
    }

    public void method8() {
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        String grade = "";
//        if (score >= 90) {
//            if (score >= 97) {
//                System.out.println("A+학점");
//            } else if (score >= 94) {
//                System.out.println("A0학점");
//            } else {
//                System.out.println("A-학점");
//            }
//
//        } else if (score >= 80) {
//            if (score <= 89) {
//                System.out.println("B+학점");
//            } else if (score <= 84) {
//                System.out.println("B0학점");
//            } else {
//                System.out.println("B-학점");
//            }
//        } else if (score >= 70) {
//            if (score >= 77) {
//                System.out.println("C+학점");
//            } else if (score >= 74) {
//                System.out.println("C0학점");
//            } else {
//                System.out.println("C-학점");
//            }
//        } else if (score >= 60) {
//            if (score >= 67) {
//                System.out.println("D+학점");
//            } else if (score >= 64) {
//                System.out.println("D0학점");
//            } else {
//                System.out.println("D-학점");
//            }
//        } else {
//            System.out.println("F학점");
//        }
        if (score == 100) grade = "A+";
        else if(score>=90) grade = "A";
        else if(score>=80) grade = "B";
        else if(score>=70) grade = "C";
        else if(score>=60) grade = "D";
        else grade = "F";

        if (score != 100 && score > 60) {
            if (score % 10 <= 3) {
                grade += "-";
            } else if (score % 10 <= 6) {
                grade += "0";
            } else if (score % 10 <= 9) {
                grade += "+";
            }
        }
        System.out.println(grade);

    }
}