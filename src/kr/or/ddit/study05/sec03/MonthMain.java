package kr.or.ddit.study05.sec03;

import java.util.Scanner;

public class MonthMain {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MonthMain obj = new MonthMain();
        obj.process();
        obj.print();
    }

    public void process(){
        Month(Month.JAN);
    }

    public void print() {
        for (Month m : Month.values()) {
            System.out.println(m.name()+","+m.numMonth);
        }
    }
    

    public void Month(Month month) {
        if(month== Month.JAN) System.out.println("1월");
        if(month== Month.FEB) System.out.println("2월");
        if(month== Month.MAR) System.out.println("3월");
        if(month== Month.APR) System.out.println("4월");
        if(month== Month.MAY) System.out.println("5월");
        if(month== Month.JUN) System.out.println("6월");
        if(month== Month.JUL) System.out.println("7월");
        if(month== Month.AUG) System.out.println("8월");
        if(month== Month.SEP) System.out.println("9월");
        if(month== Month.OCT) System.out.println("10월");
        if(month== Month.NOV) System.out.println("11월");
        if(month== Month.DEC) System.out.println("12월");
    }
   
}


