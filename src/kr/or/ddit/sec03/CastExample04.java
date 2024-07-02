package kr.or.ddit.sec03;

import java.util.Date;
import java.util.Scanner;

public class CastExample04 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CastExample04 obj = new CastExample04();
        obj.process();

    }

    public void process() {
        int a1 = 10;

        //s1에 넣어보기
        String s1 = String.valueOf(a1);
        System.out.println("s1 = " + s1);
        String s2 = ""+a1;
        System.out.println("s2 = " + s2);

        int value = Integer.parseInt(s1);
        System.out.println("value = " + value);

        String sb = "10";
        byte bte2 = Byte.valueOf(sb);
        System.out.println("bte2 = " + bte2);

        String si = "40";
        int parse1 = Integer.parseInt(si);
        System.out.println("parse1 = " + parse1);

        String sl = "50";
        long parse2 = Long.parseLong(sl);
        System.out.println("parse2 = " + parse2);

        String sf = "4.5";
        float parse3 = Float.parseFloat(sf);
        System.out.println("parse3 = " + parse3);

        String sd = "10.3";
        double parse4 = Double.parseDouble(sd);
        System.out.println("parse4 = " + parse4);

        String str = "true";
        boolean parse5 = Boolean.parseBoolean(str);
        System.out.println("parse5 = " + parse5);

    }
}
