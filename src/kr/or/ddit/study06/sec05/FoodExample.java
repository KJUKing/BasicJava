package kr.or.ddit.study06.sec05;

import org.w3c.dom.ls.LSOutput;

public class FoodExample {



    public static void main(String[] args) {
        Food.today ="0624";


        Food f1 = new Food(2, "망고", 5000);
        Food f2 = new Food(3, "수박", 4000);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
