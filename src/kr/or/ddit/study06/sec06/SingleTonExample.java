package kr.or.ddit.study06.sec06;

public class SingleTonExample {
    public static void main(String[] args) {
        SingleTonV1 sigleton = SingleTonV1.getInstance();
        SingleTonV1 sigleton2 = SingleTonV1.getInstance();
        SingleTonV1 sigleton3 = SingleTonV1.getInstance();
        SingleTonV1 sigleton4 = SingleTonV1.getInstance();
        SingleTonV1 sigleton5 = SingleTonV1.getInstance();
        SingleTonV1 sigleton6 = SingleTonV1.getInstance();

        System.out.println(SingleTonV1.getCnt());
    }
}
