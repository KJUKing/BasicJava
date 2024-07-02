package kr.or.ddit.study11;

import java.util.Scanner;

public class MathExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MathExample obj = new MathExample();
        obj.process();
//        obj.print();
    }

    public void process(){
        // Math
        // 수학과 관련된 연산 처리 및 함수를 모아둔 클래스
        method4();
    }

    public void method1() {

        int a = 5;
        int result = Math.abs(a);
        System.out.println("result = " + result);
    }

    public void method2() {

        double a = 10.7;
        double result = Math.floor(a);
        System.out.println("result = " + result);
    }

    public void method3() {
        int a = 20;
        int b = 10;
        int max = Math.max(a, b);
        System.out.println("max = " + max);

        int[] array = {1, 2, 3, 4, 5};
//        maxArray(array);
        maxArray(1, 2, 3);
    }

    public void method4() {
        int num = 100;
        double result = Math.log10(num);
        System.out.println("result = " + result);

        //반올림
        long round = Math.round(10.7);
        System.out.println("round = " + round);

        // 루트
        double sqrt = Math.sqrt(4);
        System.out.println("sqrt = " + sqrt);

        //n의 m승
        int a = 2;
        int b = 10;
        double pow = Math.pow(a, b);
        System.out.println("pow = " + pow);

    }

    public void method5() {
        // k    m    g    t
        // 10^3 10^6 10^9 10^12
        double tenPow = Math.pow(10, 12);
        double binaryPow = Math.pow(2, 40);

        // 2^10 2^20 2^30 2^40

        System.out.println(tenPow);
        System.out.println(binaryPow);
    }

    public int maxArray(int... array) {

        int max = Integer.MIN_VALUE;
        for (int arr : array) {
            if (arr > max) {
                max =arr;
            }

        }
        return max;
    }

    public double floor(double num, int digit) {
        //digit 1
        //10.7 -> 10
        //digit 2
        //10.73 -> 10.7

        for (int i = 1; i < digit; i++) {
            num*=10;
        }
        num = Math.floor(num);
        for (int i = 1; i < digit; i++) {
            num/=10;
        }
        return num;
    }



}


