package kr.or.ddit.study07.Car;

public class Bus extends Car{


    public void wheel() {
        System.out.println("버스의 바퀴숫자는 4개");
    }

    public Bus() {
        super.oilType = "경유";
    }
}
