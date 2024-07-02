package kr.or.ddit.study06.sec04;

public class Cylinder {

    int r; // 반지름
    int h;
    int b;
    int c;


    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(10);
        double volume = c1.getVolume(10);

        System.out.println("원기둥 부피값 = " + volume);
    }

    // 메소드 부피 구하기
    public double getVolume(int b) {
        return Math.PI*r*r*b;
    }

    // 부티 = 원의 넓이 * 높이

    public Cylinder(int r) {
        this.r = r;
    }
}
