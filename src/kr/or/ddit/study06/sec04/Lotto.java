package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.process();
    }
    public void process() {
// 번호가 1~8까지인 로또 bundle을 만드시오.

//        int[][] paper = lottoPaper();
//        for (int[] lotto : paper) {
//            System.out.println(array2String(lotto));
//        }

        int[][][] bundle = bundle(12000);
        printBundle(bundle);
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
            int ran = new Random().nextInt(45)+1;
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
}


