package kr.or.ddit.study05.sec02;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayExample03 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayExample03 obj = new ArrayExample03();
        obj.process();

    }

    public void process() {

//        method1();
//        method2();
        method4();
    }

    public void method1() {
        int[] array = {1, 3, 4, 2, 5};

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void method2() {
        int[][] arr = new int[3][];
        arr[0] = new int[]{90,80,70};
        arr[1] = new int[]{90,80,70};
        arr[2] = new int[]{90,80,70,50};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+"\t");

            }
            System.out.println();
        }

    }

    public void method3() {

        int a = 10;

        int b = 20;

        if (a + b == 30) {
            String c = "abc";

            if (a == 10) {
                String[] d = new String[3];

                d[0] = "def";
                d[1] = c;
                d[2] = "abc";

            }

            int[] e = {1, 2, 3, 4, 5};

            int[][] f = new int[3][5];

            f[2] = e;

            f[0][0]= 3;
        }

    }


    public void method4() {
        int[][] arr = new int[2][2];

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[i].length; j++) {
                System.out.println(arr[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}