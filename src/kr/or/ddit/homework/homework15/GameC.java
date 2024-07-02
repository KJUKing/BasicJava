package kr.or.ddit.homework.homework15;

import java.util.Scanner;

public class GameC extends Game{

    @Override
    public int playGame(int money) {

            int myMoney = money;
            Scanner sc = new Scanner(System.in);
            System.out.println("주사위 숫자 맞추기");
            System.out.println("1~6의 숫자를 골라주세요");
            int ran = (int) (Math.random() * 6) + 1;
            int i = sc.nextInt();

            if (i == ran) {
                System.out.println("나의 숫자 : " + i);
                System.out.println("컴퓨터의 숫자 : " + ran);
                System.out.println("맞췄습니다!");
                myMoney += 20000;

            } else {
                System.out.println("나의 숫자 : " + i);
                System.out.println("컴퓨터의 숫자 : " + ran);
                System.out.println("틀렸습니다");
            }


        return myMoney;

    }
    @Override
    public int payMoney(int money) {
        return money - 3000;
    }
}
