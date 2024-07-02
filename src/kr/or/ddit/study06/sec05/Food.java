package kr.or.ddit.study06.sec05;

public class Food {
    // 오늘 날짜를 필드로 만드시오
    // 유통기한, 이름, 가격

    static String today = "2024년 6월 24일";

    int expDay;

    String name;

    int price;

    public Food(int expDay, String name, int price) {
        this.expDay = expDay;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{today "+today+
                ", expDay=" + expDay +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

