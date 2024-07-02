package kr.or.ddit.study06.sec03;

public class Student {
    // 국가
    String nation;
    // 호실
    String room;
    // 이름
    String name;
    // 나이
    int age;


    public Student(String name, int age) {
        // nation 한국
        // room 406호
        this("406호", name, age);
    }

    public Student(String room, String name, int age) {
        this("한국", room, name, age);
    }

    public Student(String nation, String room, String name, int age) {
        this.nation = nation;
        this.room = room;
        this.name = name;
        this.age = age;
    }
}
