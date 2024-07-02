package kr.or.ddit.study08.game;

import java.util.Scanner;

public class GameMain {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GameMain obj = new GameMain();
        obj.process();
    }

    public void process() {
        int money = 10000;
        while (true) {

            IGame game = null;

            System.out.println("1. 게임A");
            System.out.println("2. 게임B");
            System.out.println("3. 게임C");
            int sel = sc.nextInt();
            if(sel == 1) game = new GameA();
            if(sel == 2) game = new GameB();
            if(sel == 3) game = new GameC();

            money += game.playGame();
            money -= game.payMoney();
            if (money <= 0) {
                System.out.println("파산");
                break;
            }
        }
    }
}
