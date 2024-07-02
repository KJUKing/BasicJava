package kr.or.ddit.study06.sec06.getset;

import java.util.Scanner;

public class GetSetExample {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Scanner sc = new Scanner(System.in);
        while(age < 0 || age > 122) {
            System.out.println("해당 나이 입력불가 다시입력하시오");
            age = sc.nextInt();
        }
        this.age = age;
    }
}
