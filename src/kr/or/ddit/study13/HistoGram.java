package kr.or.ddit.study13;

import java.util.Random;
import java.util.Scanner;

public class HistoGram {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HistoGram obj = new HistoGram();
        obj.process();
    }

    public void process() {
        // 주사위 2개의 눈금 합
        int roll = 10000;
        int[] diceSum = roll(100);
        printHistoGram(diceSum, roll);
    }

    public void printHistoGram(int[] diceSum, int n) {
        //2  7
        //3  11
        //4  17

        for (int num = 2; num <= 12; num++) {

            for (int i = 0; i < diceSum[num]*100/n; i++) {
                System.out.print("■");
            }

            System.out.println();
        }

    }

    public int[] roll(int n) {
        // n=100;
        // 2 7
        // 3 11
        // 4 17
        int[] diceSum = new int[13];
        //주사위 2개를 n번 던졌을때 diceSum에
        //눈금 합이 나온 개수를 담으시오
        for (int i = 0; i < n; i++) {
            int diceTwo = throwTwoDice();
            diceSum[diceTwo]++;
        }
        return diceSum;
    }

    public int throwDice() {
        return new Random().nextInt(6) + 1;

    }
    public int throwTwoDice() {
        return throwDice() + throwDice();
    }
}

