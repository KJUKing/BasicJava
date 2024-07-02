package kr.or.ddit.study13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    /**
     * HashMap
     * - key와 value로 이루어짐
     * - key 값은 중복을 허용하지않고 순서가 보장되지않음 (HashSet과 동일함)
     *
     * 주요메서드
     * .put(key, value) : 데이터 입력 key 값은 중복되지않음. value는 중복허용
     * .get(key)    : 입력받은 value값을 key 값을 통해 꺼내볼수있음.
     * .keySet()    : key로 이루어진 hashSet을 가져옴
     * .remove()      입력받은 value값을 key 값을 통해 꺼내올수있음
     */

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("홍길동", 100);
        map.put("이순신", 200);
        map.put("정몽주", 300);
        map.put("정몽주", 400);

        System.out.println(map.get("이순신"));
        System.out.println(map.get("정몽주"));
        System.out.println(map.get("정몽주"));

        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            int value = (int) map.get(key);
            System.out.println(key + ", " + value);
        }


    }
}
