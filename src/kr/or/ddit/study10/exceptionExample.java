package kr.or.ddit.study10;


import java.util.Scanner;

public class exceptionExample {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ExceptionExample02 obj = new ExceptionExample02();
        obj.process();
    }

    public void process() {
//        method1();
//        method2();
//        method3();
        method4();
    }



    public void method1() {
        try {
            int num = sc.nextInt();
            int[] arr = {1, 2};
//            int[] arr = null;
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 벗어남");
        } catch (NullPointerException e) {
            System.out.println("널 포인트 넣음");
        } catch (Exception e) {
            System.out.println("에러");
        }

    }

    public void method2() {
        System.out.println("메소드 2실행");
    }

    public void method3() {
        // 숫자 입력할때까지 계속 실행하기

        int num =0;
        while (true) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("숫자 입력");
            try {
                num = sc2.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("숫자를 입력하지 않았습니다");
            }
        }
        int add = num + 10;
    }

    public void method4() {
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");

            String str = null;
            str.equals("");
            System.out.println("5");
        } catch (Exception e) {

        }


    }
}
