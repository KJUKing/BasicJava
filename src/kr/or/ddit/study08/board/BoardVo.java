package kr.or.ddit.study08.board;


public class BoardVo {
    private int boarNo;
    private String name;
    private String content;
    private String writer;
    private int cnt;

    public BoardVo(int boarNo, String name, String content, String writer) {
        this.boarNo = boarNo;
        this.name = name;
        this.content = content;
        this.writer = writer;
    }

    public int getBoarNo() {
        return boarNo;
    }

    public void setBoarNo(int boardNum) {
        this.boarNo = boardNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "BoardVo{" +
                "boarNo=" + boarNo +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", cnt=" + cnt +
                '}';
    }
}
