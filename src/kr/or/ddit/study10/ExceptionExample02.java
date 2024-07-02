package kr.or.ddit.study10;
import java.util.Scanner;

public class ExceptionExample02 {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ExceptionExample02 obj = new ExceptionExample02();
        obj.process();
    }

    public void process() {
//        int[] arr = {1, 2, 3};
        int[] arr = null;
        try {
            method1(arr);
        } catch (Exception e) {
            System.out.println(e);
        }

//        method2();
//        method3();
//        method4();
    }



    public void method1(int[] arr) throws Exception {

        try {
            for (int num : arr) {
                System.out.println(num);

            }
        } catch (Exception e) {
            throw new Exception("에러발생");
        }

    }

    public void method2() {

    }

    public void method3() {

    }

    public void method4() {


    }
}

