package kr.or.ddit.homework;

import kr.or.ddit.study06.db.DBService;

import java.util.Scanner;

public class HomeWork13 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork13 obj = new HomeWork13();
        obj.process();

    }

    public void process() {
        System.out.println("취미를 입력하세요");
        String mem_like = sc.next();
        DBService dbService = new DBService();
        dbService.selectAll(mem_like);

        // mem_id, mem_name, mem_add1, mem_job, mem_like
        // where 조건에 취미 입력

    }

    public void method1() {

    }

}
