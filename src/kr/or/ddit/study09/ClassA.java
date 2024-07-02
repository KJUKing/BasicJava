package kr.or.ddit.study09;

public class ClassA {

    class ClassB {
        int b;
    }

    static class ClassC {
        int c;
    }

    public static void main(String[] args) {
        // int b에다가 10 넣어보기

        // int c에다가 20 넣어보기
        ClassB ab = new ClassA().new ClassB();

        ClassC cc = new ClassA.ClassC();
    }
}
