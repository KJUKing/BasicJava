package kr.or.ddit.study07.phone;

public class PhoneMain {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.touch();
        sp.internet();


        IPhone ip = new IPhone();
        ip.call();
        ip.touch();
        ip.internet();
        ip.appStore();
    }
}
