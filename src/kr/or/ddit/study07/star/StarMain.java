package kr.or.ddit.study07.star;

import java.util.Scanner;

public class StarMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Unit unit = null;
            System.out.println("1.저글링, 2.뮤탈");
            int num = sc.nextInt();
            if (num==1) unit = new Juggling();
            if (num==2) unit = new Mutal();

            System.out.println("1. 공격, 2. 이동");
            num = sc.nextInt();
            if (num==1) unit.attack();
            if (num==2) unit.move();

        }
    }
}
