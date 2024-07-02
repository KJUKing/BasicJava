package kr.or.ddit.study08.ani;

import java.util.Scanner;

public class AniMain {
    public static void main(String[] args) {
        // Animal 인터페이스 생성
        // crt method 생성

        // Cat 클래스 생성 Animal 상속받을것
        Cat cat = new Cat();

        // Dog 클래스 생성 Animal 상속받을것
        Dog dog = new Dog();

        System.out.println("1. 고양이, 2. 강아지");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {
            Cat ani = new Cat();
        }
        dog.cry();

        cat.cry();
    }
}
