package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample03 {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayListExample03 obj = new ArrayListExample03();
        obj.process();



    }

    public void process() {
//        List list = new ArrayList();
//        list.add(10);
//        list.add("String");
//        list.add(10.4);
//
//        int l1 = (int)list.get(0);
//        System.out.println(l1);
//
//        String l2 = (String) list.get(1);
//        System.out.println(l2);

        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(123);
//        list.add("STring"); 제네렉으로 인트값만 넣기제약
//        int l1 = list.get(0);
//        int l2 = list.get(1);
//
//        System.out.println(l1);
//        System.out.println(l2);
//

        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
