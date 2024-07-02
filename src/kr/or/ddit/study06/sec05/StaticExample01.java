package kr.or.ddit.study06.sec05;

public class StaticExample01 {

    int a;
    int b;
    static int c;
    static int d;

    public void method1() {
        // method2 가져올수있음
        // c값 갖고올수있음
    }

    public void method2() {

    }

    public static void method3() {
        // a값 못갖고옴
        // method4가져올수있다
    }

    public static void method4() {
        // c값 가져올수있음
    }
}
