package kr.or.ddit.study13;

import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomArrayList sList = new CustomArrayList();
        while (true) {
            String str = sc.next();
            if (str.equals("exit")) break;
            sList.add(str);

        }

        String remove = sList.remove(0);
        System.out.println(remove + " <- 탈퇴자");

        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

    }
}
