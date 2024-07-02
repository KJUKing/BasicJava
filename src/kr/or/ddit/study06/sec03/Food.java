package kr.or.ddit.study06.sec03;

public class Food {

    // 이름, 유통기한, 가격을
    // 각각 적절한 타입을 이용해 필드로만들고 값을 만들기

    // 기본생성자 x

    String name;
    double limitDay;
    int price;

    public Food(String name, double limitDay, int price) {
        this.name = name;
        this.limitDay = limitDay;
        this.price = price;
    }
}
