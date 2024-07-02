package kr.or.ddit.study08.board;

import java.util.Scanner;

public class DataInput {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DataInput obj = new DataInput();
        obj.process();
    }

    public void process() {

        while (true) {
            System.out.println("1. 게시판 등록");
            System.out.println("2. 게시판 전체 조회");
            System.out.println("3. 게시판 상세 조회");
            System.out.println("4. 게시판 삭제");
            System.out.println("5. 게시판 내용 변경");
            int sel = sc.nextInt();
            if (sel == 1) insert();

        }
    }
    public void insert() {
        System.out.println("게시판 번호");
        int boardNo = sc.nextInt();
        System.out.println("제목");
        String title = sc.next();
        System.out.println("내용");
        String content = sc.next();
        System.out.println("작성자");
        String writer = sc.next();

        IBoard board = new BoradImple();

        board.insert(boardNo, title, content, writer);
    }
}
