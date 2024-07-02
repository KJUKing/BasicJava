package kr.or.ddit.study06.sec06.getset;

public class Food {
    // 이름, 유통기한 가격을 각 필드로 만들고
    // 접근을 제한하시오

    private String name;
    private int ExpDay;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpDay() {
        return ExpDay;
    }

    public void setExpDay(int expDay) {
        ExpDay = expDay;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Food(String name, int expDay, int price) {
        this.name = name;
        ExpDay = expDay;
        this.price = price;
    }
}
