package kr.or.ddit.homework;

import java.util.Date;

public class HomeWork01 {
    public static void main(String[] args) {
        Date date = new Date();

        long time = date.getTime();
        // ms 1000ms = 1s
        // 400초 -> 00년 00일 00시 06분 33초 ....
        System.out.println(time);

        // xx년 xx일 xx시 xx분 xx초 지났습니다.
        long year = time / 31557600000L;
        long year_Garbage = time % 31557600000L;
        System.out.println("year = " + year);
        System.out.println("year_Garbage = " + year_Garbage);
        long day = year_Garbage / 86400000L;
        long day_Garbage = year_Garbage % 86400000L;
        System.out.println("day = " + day);
        System.out.println("day_Garbage = " + day_Garbage);
        long hour = day_Garbage / 3600000;
        long hour_Garbage = day_Garbage % 3600000;
        System.out.println("hour_Garbage = " + hour);
        System.out.println("hour_Garbage = " + hour_Garbage);
        long min = hour_Garbage / 60000;
        long min_Garbage = hour_Garbage % 60000;
        System.out.println("min = " + min);
        System.out.println("min_Garbage = " + min_Garbage);
        long sec = min_Garbage / 1000;
        long sec_Garbage = min_Garbage % 1000;
        System.out.println("sec = " + sec);
        System.out.println("sec_Garbage = " + sec_Garbage);



        System.out.printf("%d년 %d일 %d시 %d분 %d초 지났습니다.", year, day, hour, min, sec);
    }
}
