package kr.or.ddit.study06.sec03;

public class Constructor {
    public Constructor() {
        System.out.println("기본생성자");
    }

    public Constructor(int a) {

        System.out.println("파라미터 int a 생성자");

    }
    public Constructor(int a, int b) {
        System.out.println("파라미터 int a, b생성자");

    }

    //오버로딩
    // 파라미터 개수, 타입마다 호출되는 생성자가 다름
}
