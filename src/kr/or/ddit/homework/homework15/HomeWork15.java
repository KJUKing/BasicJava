package kr.or.ddit.homework.homework15;

import java.util.Scanner;

public class HomeWork15 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork15 obj = new HomeWork15();
        obj.process();

    }


    public void process() {
        int money = 10000;

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println();
            System.out.println("게임 시작");
            System.out.println("현재 나의 금액 : " + money);
            if (money < 1000) {
                System.out.println("금액이 부족합니다");
                break;
            }
            System.out.println("1번 홀짝 맞추기 / 2번 가위바위보 / 3번 주사위숫자 맞추기 / 0번 종료하기");
            System.out.println("1번 1000원, 2번 2000원, 3번 3000원");
            int i = sc.nextInt();

            if (i == 1) {
                Game game1 = new GameA();
                money = game1.payMoney(money);
                System.out.println("현재 나의 금액 : " + money);
                money = game1.playGame(money);
            }
            if (i == 2) {
                Game game2 = new GameB();
                money = game2.payMoney(money);
                System.out.println("현재 나의 금액 : " + money);
                money = game2.playGame(money);
            }
            if (i == 3) {
                Game game3 = new GameC();
                money = game3.payMoney(money);
                System.out.println("현재 나의 금액 : " + money);
                money = game3.playGame(money);
            }
            if (i == 0) {
                System.out.println("종료합니다");
                break;
            }
        }
            // Game이라는 클래스 생성
            // Game 메소드
            //Game A, Game B, Game C는 Game을 상속 받을 것.
            // public abstract int playGame();
            // public abstract int payMoney();

            // GameA
            // playGame -> 홀짝 게임 맞출시 상금 3000
            // payMoney -> 게임 플레이시 1000원 지불

            // GameB
            // playGame -> 가위바위보 맞출시 상금 5000
            // payMoney -> 게임 플레이시 2000원 지불

            // GameC
            // playGame -> 주사위 숫자 맞추기 맞출시 상금 20000
            // payMoney -> 게임 플레이시 3000원 지불
            // 금액 다 쓸시 게임 종료
    }
}

