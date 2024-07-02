package kr.or.ddit.study06.sec06.getset;

public class SingGetSetMain {

    public static void main(String[] args) {
        Sing s1 = new Sing("핫식스", "철수", 2024, "학식스좋아");
        Sing s2 = new Sing("핫식스 제로", "영희", 2022, "핫식스핫식스");
        Sing s3 = new Sing("핫식스 파워", "맹구", 2021, "학식스파워제로");

        System.out.println("s1.toString() = " + s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
