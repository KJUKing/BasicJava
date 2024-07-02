package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExample {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DateExample obj = new DateExample();
        obj.process();
    }

    public void process() {
        method8();
    }

        public void method8() {
            System.out.println("날짜를 입력하세요(yyyy/MM/dd)");
            String str = sc.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate inputDate = LocalDate.parse(str, formatter);
        LocalDate date = LocalDate.now();
        while (true) {
            try {
                Thread.sleep(1000);

                if (date.isEqual(inputDate)) {
                    System.out.println("알람");
                    break;  // 알람이 울리면 반복문을 멈춤
                } else {
                    System.out.println("현재 날짜: " + date.format(formatter));
                }
                date = date.plusDays(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        //와일 시행시 마다 현재 날짜에서 하루 더하기
        //입력한 날짜가 되면 알림 울리기


    }
    public void method7() {
        //오늘부터 200일뒤에 날짜를
        // 20xx.xx.xx 로 표시하시오

        LocalDate date = LocalDate.now();
        LocalDate hundDay = date.plusDays(200);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String format = hundDay.format(formatter);
        System.out.println(format);
    }

    public void method6() {
        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.DATE, 1);
        cal.set(Calendar.DATE, 1);

        Date date = cal.getTime();
        System.out.println(date);
    }

    public void method5() {
        //String -> Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String str = "2025.01.20";
        try {
            Date date = sdf.parse(str);
            System.out.println(date);

            // 오늘 날짜로부터 며칠 후인지
            Date today = new Date();
            long time = date.getTime() - today.getTime();
            System.out.println("time = " + time/86400/1000);
        } catch (ParseException e) {
            e.printStackTrace();

        }
    }
    public void method4() {
        //Date -> String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);

    }
    public void method3() {
        LocalDate date = LocalDate.now();
        date.plusDays(100);
        System.out.println("date = " + date);
    }
    public void method2() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

        long sec = 1000;
        long min = sec*60;
        long hour = min*60;
        long day = hour*24;
        long year = day*365;

        long years = time / year;
        time%=year;
        long days = time / day;
        time%=day;
        long hours = time / hour;
        time%=hour;
        long mins = time / min;
        time%=min;
        long secs = time / sec;

    }
    public void method1() {
        Date date = new Date();
        System.out.println(date);

    }
}
