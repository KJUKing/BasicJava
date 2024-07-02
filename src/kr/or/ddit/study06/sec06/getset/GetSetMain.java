package kr.or.ddit.study06.sec06.getset;

import java.util.Scanner;

public class GetSetMain {
    public static void main(String[] args) {

        int age= -2;
        GetSetExample gs = new GetSetExample();


        gs.setName("안녕");

        gs.setAge(age);

        System.out.println(gs.getName());
        System.out.println(gs.getAge());
    }
}
