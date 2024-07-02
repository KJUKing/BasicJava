package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample02 {
    public static void main(String[] args) {
        List list = new ArrayList();
//        ArrayList list = new ArrayList();

        Scanner sc = new Scanner(System.in);

        //1부터 num까지의 3의배수를 list에 담으시오

        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i %3 == 0) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
