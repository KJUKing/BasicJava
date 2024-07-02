package kr.or.ddit.study06.sec06.getset;

import java.util.Scanner;

public class FoodGetSetMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Food f1 = new Food("핫식스", 2, 2000);
        Food f2 = new Food("핫식스 제로", 5, 1200);

        System.out.println(f1.getName());
        System.out.println(f1.getExpDay());
        System.out.println(f1.getPrice());

        f1.setName("핫식스 파워");
        f1.setExpDay(3);
        f1.setPrice(3000);

        String inputStr = sc.next();
        int inputInt = sc.nextInt();
        int inputInt2 = sc.nextInt();

        System.out.println(f1.getName());
        System.out.println(f1.getExpDay());
        System.out.println(f1.getPrice());

        f2.setPrice(inputInt);
        f2.setExpDay(inputInt2);
        f2.setName(inputStr);

        System.out.println("f2.getName() = " + f2.getName());
        System.out.println("f2.getPrice() = " + f2.getPrice());
        System.out.println("f2.getExpDay() = " + f2.getExpDay());
    }
}
