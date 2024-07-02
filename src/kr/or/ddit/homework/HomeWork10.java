package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork10 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork10 obj = new HomeWork10();
        obj.process();

    }

    public void process() {
        //        int x1 = 0;
//        int y1 = 0;
//
//        int x2 = 0;
//        int y2 = 10;
//
//        int x3 = 10;
//        int y3 = 0;
//
//        double area = Math.abs((x1*y2+x2*y3+x3*y1)-(x1*y3+x2*y1+x3*y2))/2;
//        System.out.println(area);


        Triangle t1 = new Triangle(0, 0, 0, 10, 10, 0);
        Triangle t2 = new Triangle(new Point(0,0),new Point(0, 10),new Point(10, 0));

        System.out.println(t1.area);
        System.out.println(t1.toString());


        System.out.println(t2.area);
        System.out.println(t2.toString());
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Triangle {
    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;
    double area;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        this.area = Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x1 * y3 + x2 * y1 + x3 * y2)) /2;
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.x1 = p1.x;
        this.y1 = p1.y;
        this.x2 = p2.x;
        this.y2 = p2.y;
        this.x3 = p3.x;
        this.y3 = p3.y;
        this.area = Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x1 * y3 + x2 * y1 + x3 * y2)) /2;
    }

    @Override
        public String toString() {
            return "p1=(" + x1 + ", " + y1 + "), p2=(" + x2 + ", " + y2 + "), p3=(" + x3 + ", " + y3 + "), Area=" + area;
    }
}