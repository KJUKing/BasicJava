package kr.or.ddit.study08.board;

public class BoradImple implements IBoard {
    @Override
    public void insert(int boarNo, String title, String content, String writer) {
        System.out.println("DB에 데이터 입력");
    }

    @Override
    public void delete(int boardNo) {
        System.out.println(boardNo + "게시판 데이터 삭제");
    }

    @Override
    public void update(BoardVo boardVo) {
        System.out.println("DB에 게시판 데이터 변경");
    }

    @Override
    public BoardVo view(int boardNo) {
        System.out.println("DB에 게시판 데이터 가져오기");
        return null;
    }

    @Override
    public BoardVo[] list() {
        System.out.println("DB에 게시판 전체 데이터 가져오기");
        return null;
    }
}
