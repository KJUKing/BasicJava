package kr.or.ddit.study11;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringExample obj = new StringExample();
        obj.process();
//        obj.print();
    }

    public void process() {

        method8();
    }

    public void method1() {
        String test = "문자열 테스트입니다.";

        for (int i = 0; i < test.length(); i++) {
            System.out.print(test.charAt(i) + " ");

        }
        System.out.println();

        //문자열 -> 문자 배열
        char[] ch = test.toCharArray();
        System.out.println(Arrays.toString(ch));
    }

    public void method2() {
        String test = "문자열 TEST";

        if (test.equals("문자열 TEST")) {
            System.out.println("같은 문자열");

        }
        if (test.contains("문자열")) {
            System.out.println("문자열을 포함하고 있음");
        }
    }

    public void method3() {
        String test = "문자열 test입니다.";

        if (test.startsWith("문자열")) {
            System.out.println("'문자열'로 시작합니다.");
        }

        if (test.endsWith("입니다.")) {
            System.out.println("'입니다.'로 끝납니다.");
        }

        File dir = new File("//192.168.146.20/JAVA/숙제제출/0604");

        for (Object name : dir.list()) {
            System.out.println(name);
        }
    }

    public void method4() {
        String test = "소문자 abcd";
        System.out.println(test);

        test = test.toUpperCase();
        System.out.println(test);

        test = test.toLowerCase();
        System.out.println(test);
    }

    public void method5() {
        String test = "  문자열 test\t\t\n\n";
        test = test.trim();
        System.out.println(test);
        System.out.println("----------");
    }

    public void method6() {
        String test = "바보 123123";
        test = test.replace("바보", "*");
        System.out.println("test = " + test);
    }

    public void method7() {
        String test = "test1, test2, test3, test4";
        String[] tokens = test.split(",");
        for (String token : tokens) {
            System.out.println(token.trim());
        }
    }

    public void method8() {


//        yn = yn.toLowerCase();


        System.out.println("계속 하시겠습니까(y/n)");
        String yn = sc.next();
        if (yn.equalsIgnoreCase("y")) {
            System.out.println("계속");

        }
        if (yn.equalsIgnoreCase("N")) {
            System.out.println("종료");
        }
    }

}
