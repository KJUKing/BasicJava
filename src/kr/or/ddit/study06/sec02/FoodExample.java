package kr.or.ddit.study06.sec02;

public class FoodExample {

    public static void main(String[] args) {
        Food food1 = new Food("햄버거", 3, 1000);
        Food food2 = new Food("핫도그", 4, 2000);

        food1.name = "햄버거";
        food1.limitDay = 3;
        food1.price = 1000;

        food2.name = "핫도그";
        food2.limitDay = 4;
        food2.price = 4000;

        System.out.println(food1.name);
    }

}
