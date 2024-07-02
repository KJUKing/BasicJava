package kr.or.ddit.study07.Car;

import java.util.Scanner;

public class Car {
    //필드 : 이름 수용인원 연료종류
    public String name;

    public int capacity;

    public String oilType;

    public int oil;

    public int speed;

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("달립니다~");
            if (oil == 0) {
                System.out.println("연료가 없습니다.");

            }
            System.out.println("계속달리시겠습니까? y/n");
            String yn = sc.next();
            if (yn.equalsIgnoreCase("y")) {
                oil -=1;
            } else if (yn.equalsIgnoreCase("n")) {
                System.out.println("멈춥니다.");
                break;
            }
        }
    }
}
