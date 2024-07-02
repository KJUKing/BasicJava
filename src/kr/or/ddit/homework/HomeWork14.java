package kr.or.ddit.homework;

import kr.or.ddit.study06.db.DBService;

import java.util.Scanner;

public class HomeWork14 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork14 obj = new HomeWork14();
        obj.process();

    }

    Member[] memberList = new Member[100];
    int cur;

    public void process() {
        while (true) {
            System.out.println("1. 회원 전체 조회");
            System.out.println("2. 회원 정보 수정");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 탈퇴");
            System.out.println("0. 나가기");
            int input = sc.nextInt();
            if (input == 1) {
                printList();
            }
            if (input == 2) {
                update();
            }
            if (input == 3) {
                insert();
            }
            if (input == 4) {
                delete();
            }
            if (input == 0) {
                break;
            }
        }
    }

    public void printList() {
        for (int i =0; i<cur; i++) {
            System.out.println(i+"번 "+memberList[i]);
        }
    }

    public void update() {
        printList();
        System.out.print("번호 입력 : ");
        int num = sc.nextInt();
        System.out.println(num + "번의 회원을 골랐습니다");
        System.out.println("수정하고 싶은 항목을 골라주세요");
        System.out.println("1번 id / 2번 pw / 3번 이름 / 3번 나이");
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("새로운 id를 적어주세요");
            String newId = sc.next();
            memberList[num].setId(newId);
        }
        if (input == 2) {
            System.out.println("새로운 pw를 적어주세요");
            int newPw = sc.nextInt();
            memberList[num].setPw(newPw);
        }
        if (input == 3) {
            System.out.println("새로운 이름를 적어주세요");
            String newName = sc.next();
            memberList[num].setName(newName);
        }
        if (input == 4) {
            System.out.println("새로운 나이를 적어주세요");
            int newAge = sc.nextInt();
            memberList[num].setAge(newAge);
        }

        System.out.println("바뀐 회원의 정보입니다.");
        System.out.println(memberList[num].toString());
    }

    public void insert() {

        Member mem = new Member();
        System.out.println("ID입력");
        String inputId = sc.next();
        mem.setId(inputId);
        System.out.println("PASSWORD입력");
        int inputPw = sc.nextInt();
        mem.setPw(inputPw);
        System.out.println("이름입력");
        String inputName = sc.next();
        mem.setName(inputName);
        System.out.println("나이입력");
        int inputAge = sc.nextInt();
        mem.setAge(inputAge);

        memberList[cur++] = mem;
    }
    public void delete() {
        printList();
        System.out.print("번호 입력 : ");
        int num = sc.nextInt();
        System.out.println(num + "번의 회원을 골랐습니다");

        for (int i = num; i < cur; i++) {
            memberList[i] = memberList[i + 1];
        }

        System.out.println("현재 회원 목록입니다.");
        printList();

        cur--;

    }

}



class Member {
    // 아이디 패스워드 이름 나이 필드로 입력

    // 생성자 사용 x lombok 사용 x
    // getter setter 만들것

    private String id;
    private int pw;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw=" + pw +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}