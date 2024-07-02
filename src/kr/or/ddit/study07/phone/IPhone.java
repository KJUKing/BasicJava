package kr.or.ddit.study07.phone;

public class IPhone extends SmartPhone {


    @Override
    public void camera() {
//        super.camera();
        System.out.println("1000만 화소 카메라");
    }


    public void appStore() {
        System.out.println("앱스토어 구현");
    }

    @Override
    public void call() {
        System.out.println(" 3g 전화걸기");

    }
}
