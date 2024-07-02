package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork09 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork09 obj = new HomeWork09();
        obj.process();

    }

    public void process() {
        // 어제 숙제 클래스 배열로 구현하기.
        Student[] stuList = new Student[5];

        // 5명 점수 및 이름 입력

        for (int i = 0; i < stuList.length; i++) {
            System.out.println(i + 1 + "번째 학생의 이름과 국,영,수 성적을 기입하시오");
            System.out.println("이름");
            String name = sc.next();

            System.out.println("국어");
            int kor = sc.nextInt();

            System.out.println("영어");
            int eng = sc.nextInt();

            System.out.println("수학");
            int math = sc.nextInt();

            int sum = kor + eng + math;
            double avg = sum / 3.0;
            stuList[i] = new Student(name, kor, eng, math, sum, (int)avg);
        }
        System.out.println("이름 국  영  수  총점  평균");
        for (int i = 0; i < stuList.length; i++) {
            System.out.println(stuList[i].name+"\t"+stuList[i].kor +"\t"+stuList[i].eng+"\t"+stuList[i].math
                    +"\t"+stuList[i].sum +"\t"+(int)stuList[i].avg);
        }
        System.out.println();

        // 총점, 평균 구하기

        // 등수 구하기

        for (int i = 0; i < stuList.length -1; i++) {
            for (int j = 0; j < stuList.length - 1; j++) {
                if (stuList[j].sum < stuList[j + 1].sum) {
                    Student temp = stuList[j];
                    stuList[j] = stuList[j + 1];
                    stuList[j+1] = temp;
                }
            }
        }

        System.out.println("이름 국  영  수  총점 평균  등수");
        // 출력하기
        for (int i = 0; i < stuList.length; i++) {
            System.out.println(stuList[i].name+"\t"+stuList[i].kor +"\t"+stuList[i].eng+"\t"+stuList[i].math
                    +"\t"+stuList[i].sum +"\t"+(int)stuList[i].avg +"\t"+(i+1)+"등");
        }
        System.out.println();
        // 정렬하기

        // 출력하기
    }
}

class Student {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    double avg;

    public Student(String name, int kor, int eng, int math, int sum, double avg) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sum = sum;
        this.avg = avg;
    }
}