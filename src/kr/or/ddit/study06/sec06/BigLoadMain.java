package kr.or.ddit.study06.sec06;

import java.util.Date;

public class BigLoadMain {
    public static void main(String[] args) {

        BigLoading b1 = BigLoading.getInstance();
        Date d1 = new Date();
        BigLoading b2 = BigLoading.getInstance();
        BigLoading b3 = BigLoading.getInstance();
        Date d2 = new Date();

        long time = d2.getTime() - d1.getTime();
        System.out.println(time + "ms");

    }
}
