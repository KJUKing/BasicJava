package kr.or.ddit.study06.sec03;

public class TvExample {

    public static void main(String[] args) {

        Tv t1 = new Tv("경주", 10, 10.5);
        Tv t2 = new Tv("주경", 20, 234.5);

        System.out.println(t2.name);
        System.out.println(t2.age);
        System.out.println(t2.size);
    }

}
