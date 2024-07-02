package kr.or.ddit.study06.sec02;

public class StudentExample {
    public static void main(String[] args) {
        // 학생 하나 만들고 값을 넣어보기
        Student s1 = new Student("김자바", 80, 60, 50);
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.avg = (double) s1.sum / 3;

    }
}
