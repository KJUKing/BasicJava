package kr.or.ddit.study06.sec06;

public class BigLoading {
    private static BigLoading instance;

    public BigLoading() {
        System.out.print("파일 로딩중");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static BigLoading getInstance() {

        if (instance == null) {
            instance = new BigLoading();
        }
        return getInstance();
    }
}
