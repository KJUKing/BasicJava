package kr.or.ddit.study06.sec02;

public class Food {
    // 이름, 유통기한, 가격을 각각 필드로 만들고

    public Food(String name, int limitDay, int price) {
        this.name = name;
        this.limitDay = limitDay;
        this.price = price;
    }

    String name;
        int limitDay;
        int price;
}
