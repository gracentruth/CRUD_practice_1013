import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

    private ArrayList<Student> myList=new ArrayList<Student>();


    Scanner sc=new Scanner(System.in);


    //메뉴 내용을 출력해주는 메소드
    public void printMenu() {
        System.out.println("-----메뉴-----");
        System.out.println("1. 조회");
        System.out.println("2. 업로드");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("0. 종료");
        System.out.println("-------------");
        System.out.print("선택할 메뉴는?");
    }



    public  void view() {
        if (this.myList.size() == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        System.out.println("No | 이름 생년월일 학년 반  번호 등교시간 하교시간");
        for (Student s : this.myList) {
            System.out.println(s.toString());

        }
    }

    public void upload(){
        //System.out.println("upload");
        Student s=new Student();
        System.out.println("id 입력:");
        s.setId(sc.nextInt());
        System.out.println("학년 입력:");
        s.setGrade(sc.nextInt());
        System.out.println("반 입력:");
        s.setClass_num(sc.nextInt());
        System.out.println("번호 입력:");
        s.setNum(sc.nextInt());
        System.out.println("이름 입력:");
        s.setName(sc.next());

        this.myList.add(s);
    }

    public void update(){
        System.out.println("update");
    }

    public void delete(){
        System.out.println("delete");
    }
}
