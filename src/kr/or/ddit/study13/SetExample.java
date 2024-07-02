package kr.or.ddit.study13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetExample {
    /**
     * HashSet
     * key로 이루어짐
     * key값은 중복을 허용하지 않고 순서가 보장되지않음
     *
     * Set 타입의 대표컬렉션
     */


    /**
     * 주요 메서드
     * .add(key) <- 값 추가
     * .remove(key) <- 값 삭제
     * .contain(key) <- 포함여부
     * .iterator(); <- 전체 출력을 위한 이터레이터
     *
     */

    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add("1");
//        set.add(1);
//        set.add("abc");
//        set.add("가");
//        set.add("바");
//
//        Iterator it = set.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//
//        }

        Set<Integer> set = new HashSet();
        while (set.size() < 6) {
            int ran = new Random().nextInt(45) + 1;
            set.add(ran);
        }
        System.out.println(set);
    }
}
