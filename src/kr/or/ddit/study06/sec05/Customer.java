package kr.or.ddit.study06.sec05;

public class Customer {
    // 가입시 이름을 입력받으며
    // 5번째 고객마다 요금을 무료 안내해줄것

    String name;

    static int cnt =0;

    public Customer(String name) {
        this.name = name;
    }
}
