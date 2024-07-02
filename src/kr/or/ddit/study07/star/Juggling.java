package kr.or.ddit.study07.star;

public class Juggling extends Unit {

    @Override
    public void move() {
        System.out.println("이동속도 30으로 지상이동");
    }

    @Override
    public void attack() {
        System.out.println("1초에 2번 공격");
    }
}
