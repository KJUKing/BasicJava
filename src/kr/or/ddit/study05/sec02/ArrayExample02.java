package kr.or.ddit.study05.sec02;

import java.util.Collections;
import java.util.Scanner;

public class ArrayExample02 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayExample02 obj = new ArrayExample02();
        obj.process();

    }

    public void process() {
//        method1();
//        method3();
//        method4();
//        method5();
        method6();
    }

    public void method1() {
        // 얕은 복사 : 복사된 배열이나 원본 배열이 변경될때 서로간의 값이 같이 변경
        int[] source = {1, 2, 3, 4, 5};
        int[] target = source;
        System.out.println("변경 전");
        for (int i = 0; i < source.length; i++)
            System.out.print(source[i] + ", ");
        System.out.println();
        for (int i = 0; i < target.length; i++)
            System.out.print(target[i] + ", ");
        System.out.println();
        target[2] = 10;
        System.out.println("변경 후");
        for (int i = 0; i < source.length; i++)
            System.out.print(source[i] + ", ");
        System.out.println();
        for (int i = 0; i < target.length; i++)
            System.out.print(target[i] + ", ");
        System.out.println();
    }

    public void method2() {
        // 깊은 복사
        // 1. 반복문 사용
        // 2. System.arraycopy();
        // 3. clone()
        int[] source = {1, 2, 3, 4, 5};
        int[] target = new int[source.length];
        for (int i = 0; i < source.length; i++)
            target[i] = source[i];

        System.out.println("변경 전");
        for (int i = 0; i < source.length; i++)
            System.out.print(source[i] + ", ");
        for (int i = 0; i < target.length; i++)
            System.out.print(target[i] + ", ");

        target[2] = 10;
        System.out.println("변경 후");
        for (int i = 0; i < source.length; i++)
            System.out.print(source[i] + ", ");
        for (int i = 0; i < target.length; i++)
            System.out.print(target[i] + ", ");

    }

    public void method3() {
        int[] source = {1, 2, 3, 4, 5};
        int[] target = new int[source.length];

        System.arraycopy(source, 0, target, 0, 3);
        System.out.println("변경 전");
        for (int i = 0; i < source.length; i++)
            System.out.print(source[i] + ", ");
        System.out.println();
        for (int i = 0; i < target.length; i++)
            System.out.print(target[i] + ", ");
        System.out.println();
        target[2] = 10;
        System.out.println("변경 후");
        for (int i = 0; i < source.length; i++)
            System.out.print(source[i] + ", ");
        System.out.println();
        for (int i = 0; i < target.length; i++)
            System.out.print(target[i] + ", ");
        System.out.println();

    }

    public void method4() {
        int[] source = {1, 2, 3, 4, 5};
        int[] target = source.clone();

        System.out.println("변경 전");
        for (int i = 0; i < source.length; i++)
            System.out.print(source[i] + ", ");
        System.out.println();
        for (int i = 0; i < target.length; i++)
            System.out.print(target[i] + ", ");
        System.out.println();
        target[2] = 10;
        System.out.println("변경 후");
        for (int i = 0; i < source.length; i++)
            System.out.print(source[i] + ", ");
        System.out.println();
        for (int i = 0; i < target.length; i++)
            System.out.print(target[i] + ", ");
        System.out.println();
    }

    public void method5() {
        int[] temp = new int[45];
        // temp에 1부터 45까지의 값을 입력하시오.

        for (int i = 0; i < temp.length; i++) {
            temp[i] = i + 1;
        }
        // temp 배열 섞기

        for (int i = 0; i < 10000; i++) {
            int ran = (int) (Math.random() * temp.length);
            int t = temp[0];
            temp[0] = temp[ran];
            temp[ran] = t;
        }
        // lotto 배열에 temp 배열 값중 앞에 6개를 복사
        int[] lotto = new int[6];
        System.arraycopy(temp, 0, lotto, 0, 6);

        // lotto 배열 정렬
        for (int i = 0; i < lotto.length - 1; i++) {
            for (int j = 0; j < lotto.length - 1; j++) {
                if (lotto[j] > lotto[j + 1]) {
                    int temp_1 = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j + 1] = temp_1;
                }
            }

        }
        for (int result : lotto) {
            System.out.println("num = " + result);
        }


        // 출력하기.
    }

    public void method6() {
        // 학생 한명의 국영수 점수 배열을 만들어 보시오.
        int[] arr1 = {90, 87, 60};
        int[] arr2 = {80, 48, 97};

        int[][] scores = new int[2][3]; //1

        int[][] scores_1 = {{90, 87, 60},{80, 48, 97}}; //2

        int[] arr = scores_1[0];
        int[] arr_1 = scores_1[1];

        int eng = arr_1[1];
        System.out.println("eng = " + eng);

        System.out.println(scores_1[0][2]);

        //국어 점수의합
        int sum = arr[0] + arr_1[0];
        System.out.println("국어 점수의합 = " + sum);

        int kor = scores_1[0][0];
        int kor_1 = scores_1[1][0];
        int sum_1 = kor + kor_1;
        System.out.println("sum_1 = " + sum_1);



    }
}
