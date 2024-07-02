package kr.or.ddit.study06.sec03;

public class Constructor02 {

    public Constructor02() {
        this(10);
    }

    public Constructor02(int a) {
        this(a, 20);
    }

    public Constructor02(int a, int b) {
        this(a, b, 30);
    }

    public Constructor02(int a, int b, int c) {
        System.out.println(a+"," +b + "," + c);
    }
}
