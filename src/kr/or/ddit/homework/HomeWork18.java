package kr.or.ddit.homework;

import com.sun.source.tree.DeconstructionPatternTree;
import com.sun.source.tree.LiteralTree;

import java.util.*;

public class HomeWork18 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork18 obj = new HomeWork18();
        obj.process();
    }



    public void process() {
        List<Map<String, Object>> dataList = dataInput();

        System.out.println(dataList.get(1));


        int maxSalary = maxSalary(dataList);
        System.out.println("직원 최대 월급은 = " + maxSalary);
//         부서월급 전체 출력

        System.out.println("부서별 총합 월급은");
        deptSalarySum(dataList);

        // 직원 한명정보 전체 출력
        System.out.println("직원의 번호를 입력하세요");
        int empNo = sc.nextInt();
        printEmpAll(dataList, empNo);

    }
    public void printEmpAll(List<Map<String, Object>> dataList, Integer empNo) {
        // empNo 같은 직원 정보 전체 출력하기.

        for (Map<String, Object> member : dataList) {

//            System.out.println(member);
            if (member.get("EMP_NO").equals(empNo)) {
                System.out.println(member);
                System.out.println("member.get(\"EMP_NO\").getClass() = " + member.get("EMP_NO").getClass());
            }

        }

    }

    public Map deptSalarySum(List<Map<String, Object>> dataList) {
        // 부서별 월급 총합 구하기
        Map<String, Integer> DeptSalary = new HashMap<>();


        for (Map<String, Object> member : dataList) {

            String dept = (String) member.get("DEPT");
            int salary = (int) member.get("SALARY");


            if (DeptSalary.containsKey(dept)) {
                DeptSalary.put(dept, DeptSalary.get(dept) + salary );
            }else{
                DeptSalary.put(dept, salary );
            }

//            System.out.println("부서 : "+dept+" / 급여 : "+salary);
//            System.out.println(member);

        }

        for (Map.Entry<String, Integer> entry : DeptSalary.entrySet()) {
            System.out.println("" + entry.toString());
        }
        //이미 부서가 더해진적이 있따면
        return null;
    }

    public int maxSalary(List<Map<String, Object>> dataList) {
//        최대 월급 값 갖고오기
        int maxSalary = 0;
        for (Map<String, Object> member : dataList) {
            int salary = (int) member.get("SALARY");
            if (maxSalary < salary) {
                maxSalary = salary;
            }
        }
        return maxSalary;
    }

    public List<Map<String, Object>> dataInput() {
//        EMP_NO  NAME        DEPT        SALARY
//        100     KING        Executive   24000
//        103     Hunold      IT          9000
//        106     pataballa   IT          4800
//        116     Baida       Purchasing  2900
//        120     Weiss       Shipping    8000
//        5명 데이터 List Map에 담을것
        Map<String, Object> map1 = new HashMap();
        map1.put("EMP_NO", 100);
        map1.put("NAME", "KING");
        map1.put("DEPT", "Executive");
        map1.put("SALARY", 24000);


        Map<String, Object> map2 = new HashMap();
        map2.put("EMP_NO", 103);
        map2.put("NAME", "Hunold");
        map2.put("DEPT", "IT");
        map2.put("SALARY", 9000);

        Map<String, Object> map3 = new HashMap();
        map3.put("EMP_NO", 106);
        map3.put("NAME", "pataballa");
        map3.put("DEPT", "IT");
        map3.put("SALARY", 4800);

        Map<String, Object> map4 = new HashMap();
        map4.put("EMP_NO", 116);
        map4.put("NAME", "Baida");
        map4.put("DEPT", "Purchasing");
        map4.put("SALARY", 2900);

        Map<String, Object> map5 = new HashMap();
        map5.put("EMP_NO", 120);
        map5.put("NAME", "Weiss");
        map5.put("DEPT", "Shipping");
        map5.put("SALARY", 8000);

        List<Map<String, Object>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);

        for (Map<String, Object> member : list) {
            Integer empId = (Integer) member.get("EMP_NO");
            String name = (String) member.get("NAME");
            String dept = (String) member.get("DEPT");
            Integer salary =  (Integer) member.get("SALARY");
            System.out.println(empId+"\t"+name+"\t"+dept+"\t"+salary);
        }

        return list;
    }
}
