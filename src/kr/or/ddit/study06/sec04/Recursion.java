package kr.or.ddit.study06.sec04;

import java.io.File;
import java.util.Scanner;

public class Recursion {

        Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            Recursion obj = new Recursion();
            obj.process();
        }

        public void process() {
            int result = add(5);
            System.out.println("result = " + result);

            int result1 = mul(5);
            System.out.println("result1 = " + result1);

            long result2 = febo(40);
            System.out.println("result2 = " + result2);
        }

        public int add(int num) {
            if(num ==1) return 1;
            return num + add(num - 1);
        }

        public int mul(int num) {
            if(num ==1) return 1;
            return num * mul(num - 1);
        }

//        public int pow(int num) {
//            if(num ==1) return 2;
//            return *pow(num - 1);
//        }

        // 피보나치 수열을 재귀함수로 만드시오
        // 1 1 2 3 5 8 13 21 55 89

    long[] feboResult = new long[200];
        public long febo(int num) {
            if(num ==1 || num==2) return 1;
            if (feboResult[num] != 0) {
                return feboResult[num];
            } else {
                long result = febo(num - 1) + febo(num - 2);
                feboResult[num] = result;
                return result;
            }
        }

    public void fileSearch(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                fileSearch(f);
            }
        }
        System.out.println(file);
    }

}
