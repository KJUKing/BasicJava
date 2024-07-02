package kr.or.ddit.study06.sec02;

import java.util.Scanner;

public class RoomExample {
    public static void main(String[] args) {
        Room[] roomList = new Room[5];

        Scanner sc = new Scanner(System.in);
        // 101호 102호 40000 2
        // 201호 50000 2
        // 202호 60000 2
        // 401호 150000 4
        Room r1 = new Room("101호", 40000, 2);
        Room r2 = new Room("102호", 40000, 2);
        Room r3 = new Room("201호", 50000, 2);
        Room r4 = new Room("202호", 60000, 2);
        Room r5 = new Room("301호", 150000, 4);


        roomList[0] =r1;
        roomList[1] =r2;
        roomList[2] =r3;
        roomList[3] =r4;
        roomList[4] =r5;
        for (int i = 0; i < roomList.length; i++) {
            System.out.println(roomList[i].roomNum + "실");
            System.out.println(roomList[i].price + "원\t 수용인원" + roomList[i].capacity);
            System.out.println("<이전방 다음방>");
            String input = sc.next();
            if(input.equals("<")) i -=2;
        }
    }
}
