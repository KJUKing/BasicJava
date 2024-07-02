package kr.or.ddit.study06.sec03;


public class FoodExample {

    public static void main(String[] args) {
        Food f1 = new Food("포도", 10.5, 2000);

        System.out.println(f1.name +" \t"+ f1.limitDay +"\t" + f1.price);
    }
}
