package kr.or.ddit.homework;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17_1 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork17_1 obj = new HomeWork17_1();
        obj.process();
    }

    public void process() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, 1);
        SimpleDateFormat month = new SimpleDateFormat("yyyy.MM");
        while(true){
            String cnt = month.format(cal.getTime());
            int dow = cal.get(Calendar.DAY_OF_WEEK);
            int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("< 저번달     "+(cnt)+"월"+"      다음달 >");
            System.out.println("    ==========================");
            System.out.println("    월  화   수  목  금  토   일");
            int day = 1;
            boolean isLastDay = false;
            for(int i=1;i<=6; i++) {  // 주의 갯수
                for(int j=1; j<=7; j++) {  // 요일의 갯수
                    if(day==1 && j!=dow) {
                        System.out.print("\t");  // 공백 출력
                    }else {
                        System.out.print("\t" + day ); // 날짜 출력
                        if(day==last){ // 마지막 날짜까지 출력했는지 확인
                            isLastDay = true;
                            break;
                        }else {
                            day++;
                        }
                    }
                }
                System.out.println();// 줄바꿈
                if (isLastDay) {
                    break;
                }
            }
            System.out.println(" < : 저번달             > : 다음달");
            String input = sc.next();
            if (input.equals("<")) {
                cal.add(Calendar.MONTH, -1);
            } else if (input.equals(">")) {
                cal.add(Calendar.MONTH, +1);
            }
        }


    }
}
