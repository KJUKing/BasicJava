package kr.or.ddit.study08.board;

public interface IBoard {

    public void insert(int boarNo, String title, String content, String writer);

    public void delete(int boardNo);

    public void update(BoardVo boardVo);

    public BoardVo view(int boardNo);

    public BoardVo[] list();
}
