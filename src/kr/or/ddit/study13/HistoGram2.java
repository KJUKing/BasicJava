package kr.or.ddit.study13;

import java.util.*;

public class HistoGram2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HistoGram2 obj = new HistoGram2();
        obj.process();
    }

    public void process() {
        int roll = 10000;
        Map map = roll(roll);
        printHistoGram(map, roll);

    }

    public void printHistoGram(Map<Integer, Integer> map, int n) {


        for (int num = 2; num <= 12; num++) {
            System.out.print(num+"\t:");
            for (int i = 0; i < map.get(num)*100/n; i++) {
                System.out.print("■");
            }
            System.out.println();
        }
    }

    public Map roll(int num) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < num; i++) {
            int diceTwo = throwTwoDice();
            int count = 1;
            if (map.containsKey(diceTwo)) {
                count += map.get(diceTwo);
            }
            map.put(diceTwo, count);
        }
        return map;
    }

    public int throwDice() {
        return new Random().nextInt(6) + 1;

    }
    public int throwTwoDice() {
        return throwDice() + throwDice();
    }
}

