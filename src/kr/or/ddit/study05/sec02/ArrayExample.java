package kr.or.ddit.study05.sec02;


import java.util.Scanner;

public class ArrayExample {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.process();
    }

    public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//        method5();
//        method6();
//        method7();
        method8();

    }


    public void method1() {
        // 변수 3개 만들기
        int a1 = 80;
        int a2 = 84;
        int a3 = 71;

        int a;
        a = 100;

        //
        int[] arr = new int[3]; //[] 배열을 만들겠다 // new int[3] int라는 배열을 3개 만들겠다
        // 지금 arr에 값이 없는상태라 값을 넣어줘야함
        arr[0] = 100;
        // 배열 마지막에 200 넣어 보기
        arr[1] = 150;
        arr[2] = 200;

        int sum = 0;
        for(int i=0; i<3; i++) {
            sum+= arr[i];
        }
        System.out.println("총점은 : "+sum);
        System.out.println(arr);

//		double[] arr1 = new double[3];

    }
    public void method2() {
        // 90 80 67 값을 배열에 저장하고
        // 총합, 평균을 구해보시오.
        int[] arr = new int[3];
        arr[0] = 90;
        arr[1] = 80;
        arr[2] = 67;

        int sum = 0;
        for(int i=0; i<3; i++) {
            sum+=arr[i];
        }
        double avg = sum/3.0;  // 평균은 나누기 값이니 실수가 나오기에 double
        System.out.println("총값 : "+sum+"\t"+"평균 : "+avg);
    }
    public void method3() {
        int a1;
        int a2 = 10;

        int[] arr = {90,80,67,85,77};   // 배열도 만들때 값을 넣을 수 있다

//		int max = Integer.MIN_VALUE;
        int max = arr[0];

        for(int i=0; i<5 ; i++) {
            if(arr[i]>max) {      //max값을 0부터 시작해서 arr[i]값이 크면
                max = arr[i];	  //arr[i]을 max 값에 넣는다
            }
        }
        System.out.println("최대값은 : "+max);

        int[] arr1 = {90,80,67,85,77};   // 배열도 만들때 값을 넣을 수 있다

//		int min = Integer.MAX_VALUE;
        int min = arr[0];
        for(int i=0; i<5 ; i++) {
            if(arr[i]<min) {      //max값을 0부터 시작해서 arr[i]값이 크면
                min = arr[i];	  //arr[i]을 max 값에 넣는다
            }
        }
        System.out.println("최소값은 : "+min);


    }
    public void method4() {
        int a = 10;
        int b = 20;

        System.out.println("바꾸기 전 값");
        System.out.println("a : "+a+"b : "+b);

        int temp = 0;
        temp = a;      // a와 b값을 바꾸는 방법
        a = b;
        b = temp;

        System.out.println("바꾼 후 값");
        System.out.println("a : "+a+"b : "+b);

    }



    public void method6() {
        int[] arr = {67, 80, 90, 85, 77};
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) break;

        }
        for (int num : arr) {
            System.out.println("num = " + num);
        }

    }

    public void method7() {
        // 거스름돈을 구하시오.
        int[] money = {10000, 5000, 1000, 500, 100, 50, 10};

        System.out.println("거스름돈을 입력하세요");
        int m = sc.nextInt();
        // ex 43700 -> 10000원 4개 1000원 3개 500원 1개 100원 2개

        for (int coin : money) {
            int count = m/coin;
            if (count != 0) {
                System.out.println(coin+"원 "+count+"개\t");
                m %= coin;
            }
        }
    }

    public void method8() {
        // 전기 사용금액 구하기

        int[] base = {410, 910, 1600, 3850, 7300, 12940};
        double[] kwPay = {60.7, 125.9, 187.9, 280.6, 417.7, 709.5};

        System.out.println("사용한 전기 KW 입력 : ");
        int kw = sc.nextInt();

        int pay = 0;
        for (int i = 0; (i+1) * 100 <= kw; i++) {
            pay+= kwPay[i]*100;
        }
        pay += base[kw / 100] + (kw % 100) * kwPay[kw / 100];
        System.out.println("pay = " + pay);

    }
}
