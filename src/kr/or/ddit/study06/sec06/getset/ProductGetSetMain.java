package kr.or.ddit.study06.sec06.getset;

public class ProductGetSetMain {
    public static void main(String[] args) {
        Product p1 = new Product("핫식스", "음료수", "2024년 4월", "에너지 드링크");
        Product p2 = new Product("핫식스파워", "음료수", "2024년 5월", "에너지 드링크 파워");

        System.out.println(p1.toString());

        System.out.println(p2.toString());
    }
}
