package kr.or.ddit.sec02;

public class FloatExample {
    public static void main(String[] args) {
        // 실수형
        // 1) float : 4byte (부호1bit, 지수8bit, 가수23bit)
        // 2) double : 8byte (부호1bit, 지수11bit, 가수52bit)

        float f1 = 3.141592f;
        double d1 = 3.141592;

        if (f1 == d1) {
            System.out.println("같은 값");

        } else {
            System.out.println("다른 값");

        }
    }
}
