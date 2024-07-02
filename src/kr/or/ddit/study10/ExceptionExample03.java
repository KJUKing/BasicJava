package kr.or.ddit.study10;

import java.util.Scanner;

public class ExceptionExample03 {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        ExceptionExample03 obj = new ExceptionExample03();
        obj.process();
    }

public void process() throws Exception {
    String nickName = null;
    while (true) {
        try {
            nickName = nickName();
            break;
        } catch (NickNameException e) {
            System.out.println("밴");
            break;
        } catch (NickNameLengthException e) {
            System.out.println("닉네임 길이를 확인하세요");
            try {
                String str = null;
                str.equals("123");
            } catch (Exception e2) {
                break;
            }
        }
    }
    System.out.println("11111");
}

public String nickName() throws NickNameLengthException, NickNameException{
    System.out.println("닉네임(길이2~5):");
    String name = sc.next();
    if (name.length() < 2 || name.length() > 5) {
        throw new NickNameLengthException();
    }
    if (name.contains("18")) {
        throw new NickNameException();
    }
    return name;
}




class NickNameLengthException extends RuntimeException{
    public NickNameLengthException() {
        super("닉네임 길이가 너무 깁니다");
    }
}

class NickNameException extends RuntimeException{
    public NickNameException() {
        super("부적절한 닉네임입니다.");
    }
}

}
