package kr.or.ddit.sec02;

public class IntegerExample {
    public static void main(String[] args) {
        // 정수형

        // 1) byte : 1byte (127~-128)
        // 2) short : 2byte (32767 ~ -32768)
        // 3) int : 4byte (2^31-1 ~ -2^31)
        // 4) long : 8byte (2^63-1 ~ 2^63)

        byte b1 = 127;
        System.out.println("b1 = " + b1);

//        byte b2 = 128;
//        System.out.println("b1 = " + b1);
//        범위초과

        short s1 = 100;
        System.out.println("s1 = " + s1);

//        short s2 = s1 + 10; s1이라는것을 정수형으로 변환하지못함
        short s2 = (short) (s1 + 10);
        System.out.println("s2 = " + s2);

        int i1 = 100;
        System.out.println("i1 = " + i1);
        int i2 = i1 + 10;

        long l1 = 10000000000000000L; // 마지막에 L붙혀서 롱타입선언
        System.out.println("l1 = " + l1);
        long l2 = l1 + 10;
        System.out.println("l2 = " + l2);

        int var1 = 200;//10
        int var2 = 0200;//8
        int var3 = 0x200;//16
        int var4 = 0b110;//2

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);

    }
}
