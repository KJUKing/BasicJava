package kr.or.ddit.study05.sec03;

import java.util.Scanner;

public class WeekMain {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        WeekMain obj = new WeekMain();
        obj.process();
    }

    public void process(){
        int num =1;
        week(num);
        week(Week.FRI);
    }
    public void week(String day) {

        if(day.equals("sun")) System.out.println("일요일");
        if(day.equals("mon")) System.out.println("월요일");
        if(day.equals("tue")) System.out.println("화요일");
        if(day.equals("wed")) System.out.println("수요일");
        if(day.equals("thu")) System.out.println("목요일");
        if(day.equals("fri")) System.out.println("금요일");
        if(day.equals("sat")) System.out.println("토요일");
    }

    public void week(Week day) {
        if(day== Week.SUN) System.out.println("일요일");
        if(day== Week.MON) System.out.println("월요일");
        if(day== Week.TUE) System.out.println("화요일");
        if(day== Week.WED) System.out.println("수요일");
        if(day== Week.THU) System.out.println("목요일");
        if(day== Week.FRI) System.out.println("금요일");
        if(day== Week.SAT) System.out.println("토요일");

    }
    public void week(int day) {

        if(day ==1) System.out.println("일요일");
        if(day ==2) System.out.println("월요일");
        if(day ==3) System.out.println("화요일");
        if(day ==4) System.out.println("수요일");
        if(day ==5) System.out.println("목요일");
        if(day ==6) System.out.println("금요일");
        if(day ==7) System.out.println("토요일");


    }
}


