package kr.or.ddit.study06.sec06.getset;

public class Line {
    // x1 x2 y1 y2 필드 만들기
    // length
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    private double length;

    public Line(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;


    }

    public double getMethod() {
        return length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

}
