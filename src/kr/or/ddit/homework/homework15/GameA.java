package kr.or.ddit.homework.homework15;

import java.util.Random;
import java.util.Scanner;

public class GameA extends Game{


    @Override
    public int playGame(int money) {

        int myMoney = money;
            Scanner sc = new Scanner(System.in);
            System.out.println("홀짝 맞추기 게임 시작");

            System.out.println("홀 / 짝 고르기");
            String input = sc.next();

            int ran = (int) (Math.random() * 2) + 1;
            if (input.equalsIgnoreCase("홀")) {
                if (ran == 1) {
                    //1을 홀 2를 짝으로한다
                    System.out.println("컴퓨터 : 홀");
                    System.out.println("맞췄습니다!");
                    myMoney += 3000;
                }
                if (ran == 2) {
                    System.out.println("컴퓨터 : 짝");
                    System.out.println("틀렸습니다.");
                }
            }
            if (input.equalsIgnoreCase("짝")) {
                if (ran == 1) {
                    //1을 홀 2를 짝으로한다
                    System.out.println("컴퓨터 : 홀");
                    System.out.println("틀렸습니다!");

                }
                if (ran == 2) {
                    System.out.println("컴퓨터 : 짝");
                    System.out.println("맞췄습니다!");
                    myMoney += 3000;

                }
            }
            return myMoney;
}
    @Override
    public int payMoney(int money) {
        return money - 1000;
    }
}
