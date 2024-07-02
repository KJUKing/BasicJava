package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork08 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork08 obj = new HomeWork08();
        obj.process();

    }

    public void process() {
        // 5명의 3과목 성적을 각 배열에 저장하고
        // 총점과 평균 등수를 구하고 출력하시오.

        String[] name = {"철수", "영희", "훈이", "맹구", "짱구"};

        // 국 영 수 총점 평균 등수
        int[][] score = {{87, 72, 81, 0, 0, 1},
                        {95, 84, 62, 0, 0, 1},
                        {70, 100, 39, 0, 0, 1},
                        {66, 57, 59, 0, 0, 1},
                        {97, 92, 90, 0, 0, 1}
                        };

        // 총점, 평균 구하기
        for (int i = 0; i < score.length; i++) {
            score[i][3] = score[i][0]+score[i][1]+score[i][2];
            score[i][4] = score[i][3]/3;
        }


        System.out.println("정렬 전");
        System.out.println("이름 국  영  수  총점 평균 등수");
        for (int i = 0; i < score.length; i++) {
            System.out.print(name[i]+"\t");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        Arrays.sort(score);


        // 등수 구하기
        for (int i = 0; i < score.length -1; i++) {
            for (int j = 0; j < score.length - 1; j++) {
                if (score[j][3] < score[j + 1][3]) {
                    String temp_1 = name[j+1]; // 이름정렬
                    name[j + 1] = name[j];
                    name[j] = temp_1;
                }
            }

        }

        // 정렬하기(높은 등수가 위로)
        for (int i = 0; i < score.length; i++) {
            score[i][5] = i+1;
        }

        System.out.println("정렬 후");
        System.out.println("이름 국  영  수  총점 평균 등수");
        for (int i = 0; i < score.length; i++) {
            System.out.print(name[i]+"\t");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j]+"\t");
            }
            System.out.println();
        }
    }
}