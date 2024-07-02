package kr.or.ddit.homework;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HomeWork17 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork17 obj = new HomeWork17();
        obj.process();
    }

    public void process() {
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.MAY, 1);

            int month = cal.get(Calendar.MONTH);
            int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // 첫 번째 요일 앞에 빈 칸 추가
            for (int i = Calendar.SUNDAY; i < firstDayOfWeek; i++) {
                System.out.print("    ");
            }

            while (cal.get(Calendar.MONTH) == month) {
                int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
                System.out.printf("%3d ", dayOfMonth);

                // 토요일이면 줄 바꿈
                if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                    System.out.println();
                }

                // 다음 날로 이동
                cal.add(Calendar.DAY_OF_MONTH, 1);
            }

            // 마지막 줄 줄 바꿈
            if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                System.out.println();
            }
        }
}
