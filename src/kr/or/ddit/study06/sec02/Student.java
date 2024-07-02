package kr.or.ddit.study06.sec02;

public class Student {
    // 이름, 국어, 영어, 수학, 총점 , 평균

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    double avg;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

}
