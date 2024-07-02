package kr.or.ddit.homework;

import java.util.*;

public class HomeWork19 {

    public static void main(String[] args) {
        HomeWork19 obj = new HomeWork19();
        obj.process();

    }

    public void process() {
        List<Map<String, String>> dataList = dataInput();

//        printAll(dataList);
//        System.out.println("getMin(dataList, \"5961\") = " + getMin(dataList, "5961"));
        Map min = getMin(dataList);
        System.out.println("차량 번호 별 주차요금 = " + min.entrySet());


        //차량 번호 별 주차요금 출력하기
    }

    public int pay(int min) {
        // 기본요금 (분)   기본요금(원)    단위시간(분)   단위요금(원)
        //   180분           5000원        10           600
        //
        if(min <= 180) return 5000;

        return 5000+(min -180+9)/10*600;
    }

    public int getTime(String str) {
        // 05:34
        String[] tokens = str.split(":");
        int hour = Integer.parseInt(tokens[0]);
        int min = Integer.parseInt(tokens[1]);

        return hour * 60 + min;
    }

    public Map getMin(List<Map<String, String>> dataList) {
        Set<String> carNumSet = new HashSet<>();
        for (Map<String, String> map : dataList) {
            String carNum = map.get("차량번호");
            carNumSet.add(carNum);
        }
        //값꺼낼때는 이터레이터쓰기
        Map<String, Integer> map = new HashMap<>();

        Iterator<String> it = carNumSet.iterator();
        while (it.hasNext()) {
            String car = it.next();
            int min = getMin(dataList, car);
            int pay = pay(min);
            map.put(car, pay);
        }
        return map;
    }

    public int getMin(List<Map<String, String>> dataList, String carNum) {
        // 총 주차시간
        int total =0;
        //  입차시간 변수 만들기
        int inTime = 0;
        for (Map<String, String> map : dataList) {
            String time = map.get("시각");
            String car = map.get("차량번호");
            String inout = map.get("내역");

            if (!car.equals(carNum)) continue;
//            System.out.println(time+"\t"+carNum+"\t"+inout);
            if (inout.equals("출차")) {
                total += getTime(map.get("시각")) - inTime;
            }
            if (inout.equals("입차")) {
                inTime = getTime(map.get("시각"));
            }


        }

        return total;
    }

    public void printAll(List<Map<String, String>> dataList) {
        for (Map<String, String> member : dataList) {
            String time = member.get("시각");
            String carNum = member.get("차량번호");
            String inout = member.get("내역");
            System.out.println(time+"\t"+carNum+"\t"+inout);
        }
    }

    public List<Map<String, String>> dataInput() {
        // 시각       차량번호    내역
        // 05:34      5961      입차
        // 06:00      0000      입차
        // 06:34      0000      출차
        // 07:59      5961      출차
        // 07:59      0148      입차
        // 18:59      0000      입차
        // 19:09      0148      출차
        // 22:59      5961      입차
        // 23:00      5961      출차
        // 23:30      0000      출차

        Map<String, String> map1 = new HashMap();
        map1.put("시각", "05:34");
        map1.put("차량번호", "5961");
        map1.put("내역", "입차");

        Map<String, String> map2 = new HashMap();
        map2.put("시각", "06:00");
        map2.put("차량번호", "0000");
        map2.put("내역", "입차");

        Map<String, String> map3 = new HashMap();
        map3.put("시각", "06:34");
        map3.put("차량번호", "0000");
        map3.put("내역", "출차");

        Map<String, String> map4 = new HashMap();
        map4.put("시각", "07:59");
        map4.put("차량번호", "5961");
        map4.put("내역", "출차");

        Map<String, String> map5 = new HashMap();
        map5.put("시각", "07:59");
        map5.put("차량번호", "0148");
        map5.put("내역", "입차");

        Map<String, String> map6 = new HashMap();
        map6.put("시각", "18:59");
        map6.put("차량번호", "0000");
        map6.put("내역", "입차");

        Map<String, String> map7 = new HashMap();
        map7.put("시각", "19:09");
        map7.put("차량번호", "0148");
        map7.put("내역", "출차");

        Map<String, String> map8 = new HashMap();
        map8.put("시각", "22:59");
        map8.put("차량번호", "5961");
        map8.put("내역", "입차");

        Map<String, String> map9 = new HashMap();
        map9.put("시각", "23:00");
        map9.put("차량번호", "5961");
        map9.put("내역", "출차");

        Map<String, String> map10 = new HashMap();
        map10.put("시각", "23:30");
        map10.put("차량번호", "0000");
        map10.put("내역", "출차");

        List<Map<String, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);
        list.add(map8);
        list.add(map9);
        list.add(map10);


        return list;
    }
}
