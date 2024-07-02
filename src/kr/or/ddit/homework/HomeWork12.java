package kr.or.ddit.homework;

import kr.or.ddit.study06.sec04.Lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork12 {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HomeWork12 lotto = new HomeWork12();
        lotto.process();
    }
    public void process() {

// 번호가 1~8까지인 로또 bundle을 만드시오.

        int money = 100000;
        while (money > 0) {
            System.out.println("보유금액 : " + money);
            System.out.println("구매할 금액을 입력하시오.");
            System.out.println("종료를 원하시면 0을 입력해주세요");
            int pay = sc.nextInt();

            if (pay == 0) {
                System.out.println("종료합니다");
                break;
            }

            // 구매시 보유금액 줄일것
            if (money > pay) {
                money -= pay;
            }
            if (money < pay) {
                System.out.println("입력 금액이 보유 금액보다 큽니다.");
            }
            // 보유금액보다 높은 금액의 입력은 불가

            //번호가 1~8번까지인 로또 bundle


            int[][][] bundle = bundle(pay);
            printBundle(bundle);

            int[][][] a = bundle(1000);
            int[] winLotto = oneLotto();

            money += winLotto(bundle, winLotto);

            System.out.println("현재잔액 : " + money);

//            for (int i = 0; i < bundle.length; i++) {
//                for (int j = 0; j < bundle[i].length; j++) {
//                    int[] bundleNumbers = bundle[i][j];
//                    if (Arrays.equals(bundleNumbers, winLotto)) {
//                        money += 100000;
//                        System.out.println("당첨입니다");
//                    }
//                }
//            }


        }


    }

    public int winLotto(int[][][] bundle, int[] winLotto) {

        int money = 0;
        for (int[][] paper : bundle) {
            for (int[] lotto : paper) {
                String s1 = Arrays.toString(lotto);
                String s2 = Arrays.toString(winLotto);
                if (s1.equals(s2)) {
                    System.out.println("당첨입니다!");
                    money+=100000;
                }
            }
        }

        return money;
    }
    public void printBundle(int[][][] bundle) {
        for (int[][] paper : bundle) {

            System.out.println("=======================");
            for (int[] lotto : paper) {
                System.out.println(array2String(lotto));
            }
            System.out.println("=======================");
        }
    }

    public String array2String(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (array.length - 1 != i) {
                str+=", ";
            }
        }
        str+="]";
        return str;
    }

    public int[][] lottoPaper() {
        return lottoPaper(5);
    }

    public int[][] lottoPaper(int num) {
        int[][] paper = new int [num][6];
        for (int i = 0; i < paper.length; i++) {
            paper[i] =generateLotto();
        }

        return paper;
    }


    public int[] generateLotto() {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            int ran = new Random().nextInt(8)+1;
            lotto[i] = ran;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(lotto);
        return lotto;
    }

    public int[][][] bundle(int money) {
        int papers = money/5000;
        if (money % 5000 != 0) {
            papers++;
        }
        int[][][] bundle = new int[papers][5][6];

        for (int i =0; i< bundle.length; i++){
            bundle[i]=lottoPaper();
        }
        if (money % 5000 != 0) {
            int line = (money % 5000)/1000;
            bundle[bundle.length - 1] = lottoPaper(line);
        }

        return bundle;

    }

    public int[] oneLotto() {
        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            int ran = new Random().nextInt(8)+1;
            lotto[i] = ran;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(lotto);
        return lotto;
    }


}


