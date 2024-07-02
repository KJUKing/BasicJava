package kr.or.ddit.study06.sec06;

public class SingleTonV1 {
    private static SingleTonV1 instance;

    private static int cnt = 0;

    private SingleTonV1() {
        cnt++;
    }

    public static SingleTonV1 getInstance() {

        if (instance == null) {
            instance = new SingleTonV1();
        }
        return getInstance();
    }

    public static int getCnt() {
        return cnt;
    }
}
