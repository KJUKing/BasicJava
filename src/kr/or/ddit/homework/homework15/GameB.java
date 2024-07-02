package kr.or.ddit.homework.homework15;

import java.util.Scanner;

public class GameB extends Game{

    @Override
    public int playGame(int money) {
        int myMoney = money;
            Scanner sc = new Scanner(System.in);
            System.out.println("가위 바위 보 내기 게임");
            System.out.println("가위 / 바위 / 보 중 입력해주십시오");
            int ran = (int) (Math.random() * 3) + 1;
            String i = sc.next();

            if (i.equalsIgnoreCase("가위")) {
                if (ran == 1) {
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("비겼습니다");
                } else if (ran == 2) {
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("졌습니다");
                } else if (ran == 3) {
                    System.out.println("컴퓨터 : 보");
                    System.out.println("이겼습니다");
                    myMoney += 5000;
                }
            }

            if (i.equalsIgnoreCase("바위")) {
                if (ran == 1) {
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("이겼습니다");
                    myMoney += 5000;
                } else if (ran == 2) {
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("비겼습니다");
                } else if (ran == 3) {
                    System.out.println("컴퓨터 : 보");
                    System.out.println("졌습니다");
                }
            }

            if (i.equalsIgnoreCase("보")) {
                if (ran == 1) {
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("졌습니다");
                } else if (ran == 2) {
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("이겼습니다");
                    myMoney += 5000;

                } else if (ran == 3) {
                    System.out.println("컴퓨터 : 보");
                    System.out.println("비겼습니다");
                }
            }
        return myMoney;
    }

    @Override
    public int payMoney(int money) {
        return money - 2000;
    }
}
