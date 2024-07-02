package kr.or.ddit.study06.sec06.getset;

public class Sing {
    //제목 가수 발매년도 노래가사

    private String name;
    private String singer;
    private int year;
    private String words;

    public Sing(String name, String singer, int year, String words) {
        this.name = name;
        this.singer = singer;
        this.year = year;
        this.words = words;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Sing{" +
                "name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", year=" + year +
                ", words='" + words + '\'' +
                '}';
    }
}
