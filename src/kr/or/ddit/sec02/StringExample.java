package kr.or.ddit.sec02;

public class StringExample {
    public static void main(String[] args) {
        //문자와 문자열
        //문자(char) : 한글자 데이터로 ''로 묶어 선언
        //문자열(String) : 복수개의 글자로 구성된 자료(기본타입x) ""로 묶어선언

        char c1 = 'a';

        String s1 = "문자열";

        // \n, \r, \r\n : 개행 줄바꿈

        String s2 = "문\n자열";
        String s3 = "문\r자열";
        String s4 = "문\r\n자열";

        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        String s5 = "\\r 줄바꿈입니다";
        System.out.println("s5 = " + s5);

        // \t : 수평 탭 스크린 커서를 다음 탭으로 옮김
        String s6 = "문자열\t출력";
        System.out.println("s6 = " + s6);

        String s7 = "\" : 큰따옴표";
        System.out.println("s7 = " + s7);

        // "본인 이름"
        String s8 = "\"민경주\"";
        System.out.println("s8 = " + s8);

        int a = 20;
        int b = 24;

        String s9 = String.valueOf(a + b);
        System.out.println("s9 = " + s9);
        String s10 = a+b+"";
        System.out.println("s10 = " + s10);
        String s11 = "" + a + b;
        System.out.println("s11 = " + s11);

        String s12 = s10 + ", " + s11;
        System.out.println("s12 = " + s12);

    }
}
