package kr.or.ddit.study06.sec05;

import java.util.Scanner;

public class CustomerExample {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("가입자 이름을 알려주세요");
            String input = sc.next();
            Customer c1 = new Customer(input);

        Customer.cnt++;
        if (Customer.cnt % 5 == 0) {
            System.out.println("축하드립니다 "+Customer.cnt + "번째 가입자입니다.");
        }else {
            System.out.println(Customer.cnt + "번째 가입자입니다.");
        }
    }
}
