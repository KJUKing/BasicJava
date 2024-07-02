package kr.or.ddit.study13;

public class CustomArrayList {
    /**
     * ArrayList
     * - 1차원 배열구조
     * - 중복을 허락하고 순서화 제공
     * - List 타입의 컬렉션
     */

    private String[] arr;
    private int cur = 0;
    private int size = 10;

    public CustomArrayList() {
        arr = new String[10];
    }

    public CustomArrayList(int size) {
        this.size = size;
        arr = new String[size];
    }

    public void add(String s) {
        if (cur == size) {
            size += 10;
            String[] temp = new String[size];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }

        arr[cur++] = s;
    }

    public int size() {
        return cur;
    }

    public String get(int num) {
        return arr[num];
    }

    public String remove(int num) {
        String r = arr[num];
        String[] temp = arr.clone();
        for (int i = num; i < cur; i++) {
            temp[i] = temp[i + 1];
        }
        arr = temp;
        cur --;
        return r;

    }
}
