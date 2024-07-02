package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork04 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork04 obj = new HomeWork04();
        obj.process();

    }

    public void process() {
//        method1();
        method2();
//        method3();
    }

    public void method1() {
        //컴퓨터에 숫자를 랜덤으로 1,2,3 만들기
        //1 가위 2 바위 3 보
        //승패를 출력하시오.
        // ex) 컴퓨터 숫자 2
        //      나 1
        //      출력 -> 컴퓨터 :바위 , 나 : 가위
        //          졌다
        System.out.println("가위 바위 보 내기");
        System.out.println("가위 :1 바위 :2 보 :3");
        int ran = (int) (Math.random() * 3) + 1;
        int i = sc.nextInt();

//        if (i == 1 && ran == 1) {
//            System.out.println("나 : 가위 , 컴퓨터 : 가위");
//            System.out.println("비겼습니다");
//        } else if (i == 2 && ran == 2) {
//            System.out.println("나 : 바위 , 컴퓨터 : 바위");
//            System.out.println("비겼습니다");
//        } else if (i == 3 && ran == 3) {
//            System.out.println("나 : 보 , 컴퓨터 : 보");
//            System.out.println("비겼습니다");
//        } else if (i == 1 && ran == 2) {
//            System.out.println("나 : 가위 , 컴퓨터 : 바위");
//            System.out.println("졌습니다");
//        } else if (i == 1 && ran == 3) {
//            System.out.println("나 : 가위 , 컴퓨터 : 보");
//            System.out.println("이겼습니다");
//        } else if (i == 2 && ran == 1) {
//            System.out.println("나 : 바위 , 컴퓨터 : 가위");
//            System.out.println("이겼습니다");
//        } else if (i == 2 && ran == 3) {
//            System.out.println("나 : 바위 , 컴퓨터 : 보");
//            System.out.println("졌습니다");
//        } else if (i == 3 && ran == 1) {
//            System.out.println("나 : 보 , 컴퓨터 : 가위");
//            System.out.println("졌습니다");
//        } else if (i == 3 && ran == 2) {
//            System.out.println("나 : 보 , 컴퓨터 : 바위");
//            System.out.println("이겼습니다");
//        }
//
//        if (i == 1) {
//            if (ran == 1) {
//                System.out.println("나 : 가위 , 컴퓨터 : 가위");
//                System.out.println("비겼습니다");
//            } else if (ran == 2) {
//                System.out.println("나 : 가위 , 컴퓨터 : 바위");
//                System.out.println("졌습니다");
//            } else if (ran == 3) {
//                System.out.println("나 : 가위 , 컴퓨터 : 보");
//                System.out.println("이겼습니다");
//            }
//        } else if (i == 2) {
//            if (ran == 1) {
//                System.out.println("나 : 바위 , 컴퓨터 : 가위");
//                System.out.println("이겼습니다");
//            } else if (ran == 2) {
//                System.out.println("나 : 바위 , 컴퓨터 : 바위");
//                System.out.println("비겼습니다");
//            } else if (ran == 3) {
//                System.out.println("나 : 바위 , 컴퓨터 : 보");
//                System.out.println("졌습니다");
//            }
//        } else if (i == 3) {
//            if (ran == 1) {
//                System.out.println("나 : 보 , 컴퓨터 : 가위");
//                System.out.println("졌습니다");
//            } else if (ran == 2) {
//                System.out.println("나 : 보 , 컴퓨터 : 바위");
//                System.out.println("이겼습니다");
//            } else if (ran == 3) {
//                System.out.println("나 : 보 , 컴퓨터 : 보");
//                System.out.println("비겼습니다");
//            }
//        }

        if (i == 1) {
            System.out.println("나 : 가위");
        } else if (i == 2) {
            System.out.println("나 : 바위");
        } else if (i == 3) {
            System.out.println("나 : 보");
        }

        if (ran == 1) {
            System.out.println("컴퓨터 : 가위");
        } else if (ran == 2) {
            System.out.println("컴퓨터 : 바위");
        } else if (ran == 3) {
            System.out.println("컴퓨터 : 보");
        }

        if (i == ran) {
            System.out.println("비겼습니다");
        }
        if (i == 1 && ran == 2) {
            System.out.println("졌습니다");
        }
        if (i == 1 && ran == 3) {
            System.out.println("이겼습니다");
        }
        if (i == 2 && ran == 1) {
            System.out.println("이겼습니다");
        }
        if (i == 2 && ran == 3) {
            System.out.println("졌습니다");
        }
        if (i == 3 && ran == 1) {
            System.out.println("졌습니다");
        }
        if (i == 3 && ran == 2) {
            System.out.println("이겼습니다");
        }
    }
    
    public void method2() {
        //전기 사용금액 구하기
        //              기본 요금       전력량 요금(원/kwh)
        // 100k이하       410           처음 100kwh까지 60.7
        // 101~200k이하   910           다음 100kwh까지 125.9
        // 201~300k이하   1600           다음 100kwh까지 187.9
        // 301~400k이하   3850           다음 100kwh까지 280.6
        // 401~500k이하   7300           다음 100kwh까지 417.7
        // 500이상        12940               500kwh초과 709.5

        // ex) 270kwh 사용시
        //      기본요금 1600
        //      전력당 요금 100*60.7 + 100*125.9 + 70*187.9
        //      총 요금 = 1600 + 100*60.7 + 100*125.9 + 70*187.9 =
        //                  1600 + 607 + 1259 + 13153 = 16,619

        System.out.println("사용한 전기를 입력하세요 : ");
        double elec = sc.nextDouble();
        double sum = 0;

        double elec_1 = 100 * 60.7;
        double elec_2 = 100 * 125.9;
        double elec_3 = 100 * 187.9;
        double elec_4 = 100 * 280.6;
        double elec_5 = 100 * 417.7;
        double elec_reg = elec % 100;
        if (elec <= 100){
            sum += elec * 60.7 + 410;
            System.out.println("총금액 : " + sum);
        } else if (elec <= 200) {
            sum = elec_1 + (elec_reg * 125.9) + 910;
            System.out.println("총금액 : " + sum);
        } else if (elec <= 300) {
            sum = elec_1 + elec_2 + (elec_reg *187.9) + 1600;
            System.out.println("총금액 : " + sum);
        } else if (elec <= 400) {
            sum = (elec_1 + elec_2 + elec_3 + (elec_reg *280.6) + 3850);
            System.out.println("총금액 : " + sum);
        } else if (elec <= 500) {
            sum = (elec_1 + elec_2 + elec_3 + elec_4 + (elec_reg * 417.7) + 7300);
            System.out.println("총금액 : " + sum);
        }  else if (elec < 600) {
            sum = elec_1 + elec_2 + elec_3 + elec_4 + elec_5 + ((600-elec) * 709.5) + 12940;
            System.out.println("총금액 : " + sum);
        }else {
            sum = elec_1 + elec_2 + elec_3 + elec_4 + elec_5 + ((elec-500) * 709.5) + 12940;
            System.out.println("총금액 : " + sum);
        }
    }


    public void method3() {
        //영어를 입력하고 소문자라면 대문자로
        //              대문자라면 소문자로 바꾸시오
        // ex) 입력 b   ->  B
        //     입력 C   ->  c
        System.out.println("알파벳을 입력하세요");

        String str = sc.next();
        char ch = str.charAt(0);

        if ((int) ch >= 65 && (int) ch <= 90) {
            char parse_ch_lower = (char)((int) ch +32);
            System.out.println("값의 소문자 = " + parse_ch_lower);
        } else if ((int) ch >= 97 && (int) ch <= 122) {
            char parse_ch_Upper = (char) ((int) ch - 32);
            System.out.println("값의 대문자 = " + parse_ch_Upper);
        } else {
            System.out.println("잘못된 값을 입력했습니다");

        }

    }
}
