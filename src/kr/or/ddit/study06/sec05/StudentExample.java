package kr.or.ddit.study06.sec05;

import kr.or.ddit.study06.sec05.Student;

public class StudentExample {

    public static void main(String[] args) {

        Student.year = 2023;
        Student s1 = new Student();
        s1.name = "장석진";

        Student s2 = new Student();
        s2.name = "신흥섭";

        System.out.println(s1.year + "년 " + s1.name);
        System.out.println(s2.year + "년 " + s2.name);

        System.out.println("1년 후");
        Student.year++;
        System.out.println(s1.year + "년 " + s1.name);
        System.out.println(s2.year + "년 " + s2.name);
    }
}
