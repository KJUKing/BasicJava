package kr.or.ddit.study06.sec03;

public class Line {
    int x1;
    int y1;

    int x2;
    int y2;
    double length;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }



}
