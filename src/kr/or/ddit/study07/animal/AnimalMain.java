package kr.or.ddit.study07.animal;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. 고양이 2. 강아지");
        int num = sc.nextInt();

        if (num == 1) {
            Cat cat = new Cat();
            cat.cry();
        }
        if (num == 2) {
            Dog dog = new Dog();
            dog.cry();
        }

        Animal ani = null;
        if (num==1) ani = new Cat();
        if (num==2) ani = new Dog();
        ani.cry();



    }
}
