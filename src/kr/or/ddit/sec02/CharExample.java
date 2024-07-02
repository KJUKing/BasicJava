package kr.or.ddit.sec02;

public class CharExample {
    public static void main(String[] args) {
        // 정수형
        // char : 부호 없는 2byte 정수(0~65535)

        char c1 = 65;
        System.out.println("c1 = " + c1);

        char c2 = 'A';
        System.out.println("c2 = " + c2);

        char c3 = '가';
        int a3 = c3 + 0;
        System.out.println("c3 = " + c3);
        System.out.println("a3 = " + a3);
        char c4 = 44032;
        System.out.println("c4 = " + c4);
    }
}
