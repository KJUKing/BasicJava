package kr.or.ddit.study11;

import java.util.Date;
import java.util.Scanner;

public class StringBufferExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBufferExample obj = new StringBufferExample();
        obj.process();
    }
    public void process() {
        Date d1 = new Date();
        stringTest();
        Date d2 = new Date();
        System.out.println(d2.getTime() - d1.getTime());
    }

    public void stringTest() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
    }
}
