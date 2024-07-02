package kr.or.ddit.homework.HomeWork16;

import java.util.Scanner;

public class HomeWork16 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork16 obj = new HomeWork16();
        obj.process();

    }

    public void process() {
        System.out.println("전화상담 분배 방식 선택");
        System.out.println("R : RoundRobn");
        System.out.println("L : LeastJob");
        System.out.println("P : PriorityAllocation");
        System.out.println("선택 >>");
        String sel = sc.next();

        if (sel.equalsIgnoreCase("R")) {
            Schedular roundRobn = new RoundRobn();
            roundRobn.getNextCall();
            roundRobn.sendCallToAgent();
        } else if (sel.equalsIgnoreCase("L")) {
            Schedular leastJob = new LeastJob();
            leastJob.getNextCall();
            leastJob.sendCallToAgent();
        } else if (sel.equalsIgnoreCase("P")) {
            Schedular priorityAllocation = new PriorityAllocation();
            priorityAllocation.getNextCall();
            priorityAllocation.sendCallToAgent();
        } else {
            System.out.println("잘못된 문자를 입력했습니다.");
        }

        // Schedular 만들 것

        // 메소드
        //getNextCall();
        //sendCallToAgent();
        //RoundRobn LeastJob PriorityAllocation
        // 클래스는 Schedular를 상속 받을 것

        // RoundRobn
        // getNextCall
        // -> 상담전화를 대기열에서 차례대로 가져옴
        // sendCallToAgent
        // -> 차례대로 상담원에게 삼담전화를 분배

        // LeastJob
        // getNextCall
        // -> 상담전화를 대기열에서 차례대로 가져옴
        // sendCallToAgent
        // -> 대기열이 가장 짧은 상담원에게 상담전화를 분배

        // PriorityAllocation
        // getNextCall
        // -> 우선순위가 높은 상담전화를 대기열에서 가져옴
        // sendCallToAgent
        // -> 업무 스킬이 가장 우수한 상담원에게 상담전화를 분배.
    }
}
