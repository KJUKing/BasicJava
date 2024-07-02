package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork11 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork11 obj = new HomeWork11();
        obj.process();

    }
    public void process() {
        Deck deck1 = new Deck();
        deck1.print();

        int ran = (int) (Math.random() * deck1.cardList.length);
        //내카드랑 컴퓨터 카드 비교
        // getCard 메소드 이용할것
        //내카드는 맨위의 카드
        Card myCard = null;
        myCard = deck1.getCard(0);
        //컴퓨터 카드는 랜덤한 카드
        Card comCard = null;
        comCard = deck1.getCard(ran);
        //승패 내카드 값이 상대 카드값(숫자)보다 높다면 승리
        //같다면 패배 작아도 패배
        deck1.printWinLose(myCard, comCard);
    }
}

class Card {
    String type; //1로입력하되 출력은 toString으로
    int num;

    public Card(String type, int num) {
        this.type = type;
        this.num = num;
    }

    @Override
    public String toString() {
        if(num == 1) return type + "A";
        if(num == 11) return type + "J";
        if(num == 12) return type + "Q";
        if(num == 13) return type + "K";
        return type+num;
    }
}

class Deck {
    Card[] cardList;

    Deck() {
        cardList = new Card[52];
        String[] types = {"♠","♦","♥","♣"};
        int cnt = 0;

        for (String type : types) {
            for (int num = 1; num <= 13; num++) {
                Card card = new Card(type, num);
                cardList[cnt++] = card;
            }
        }
    }

    public void print() {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                System.out.print(cardList[cnt++]+" ");
            }
            System.out.println();
        }
    }

    public void shuffle() {
        // 카드 섞기 직접만들기
        //맨위의 카드는 내거 컴퓨터카드는 랜덤
        for (int i = 0; i < cardList.length-1; i++) {
            int ran = (int) (Math.random() * cardList.length);
            Card temp = cardList[i];
            cardList[i] = cardList[ran];
            cardList[ran] = temp;
        }



    }

    public Card getCard(int num) {
        return cardList[num];
    }

    public void printWinLose(Card myCard, Card comCard){
        //결과값 출력 "♠","♦","♥","♣"
        // 내카드 "♠"5 컴퓨터 카드 ♥7
        //졌따
        System.out.println("내 카드 = " + myCard);

        System.out.println("컴퓨터 카드 = " + comCard);

        if (myCard.num > comCard.num) {
            System.out.println("이겼다");
        } else {
            System.out.println("졌다");
        }
    }
}
