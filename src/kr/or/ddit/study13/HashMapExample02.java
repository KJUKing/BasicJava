package kr.or.ddit.study13;

import java.util.*;

public class HashMapExample02 {


    public static void main(String[] args)
    {

//        MEM_ID MEM_NAME MEM_BIR MEM_ADDR
//        a001 김은대 2000/03/15 대전시 동구 용운동

        Map<String, String> member1 = new HashMap();

        member1.put("MEM_ID", "a001");
        member1.put("MEM_NAME", "김은대");
        member1.put("MEM_BIR", "2000/03/15");
        member1.put("MEM_ADDR", "대전시 동구 용운동");

        Map<String, String> member2 = new HashMap();

        member2.put("MEM_ID", "b001");
        member2.put("MEM_NAME", "김대");
        member2.put("MEM_BIR", "2001/03/15");
        member2.put("MEM_ADDR", "서울 동구 용운동");

        Map<String, String> member3 = new HashMap();

        member3.put("MEM_ID", "c001");
        member3.put("MEM_NAME", "김은");
        member3.put("MEM_BIR", "2043/03/15");
        member3.put("MEM_ADDR", "부산 동구 용운동");

        List<Map<String, String>> list = new ArrayList();
        list.add(member1);
        list.add(member2);
        list.add(member3);

        for (Map<String, String> map : list) {
            String memId = map.get("MEM_ID");
            String memName = map.get("MEM_NAME");
            String memBir = map.get("MEM_BIR");
            String memAddr = map.get("MEM_ADDR");
//            if (!memName.equals("김대")) continue;
            if (!memAddr.contains("부산")) continue;
            System.out.println(memId + memName + memBir + memAddr);
        }
    }
}
