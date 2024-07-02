package kr.or.ddit.study07.Car;

public class CarMain {

    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.name = "핫식스카";
        myCar.capacity = 2;
        myCar.auto();

        Bus bus = new Bus();
        bus.name = "핫식스 버스";
        bus.capacity = 30;
        bus.wheel();


    }
}
