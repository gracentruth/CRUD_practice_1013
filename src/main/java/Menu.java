import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    private ArrayList<Student> myList=new ArrayList<Student>();
    int id=0;

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

        System.out.println("ID | 학년 반 번호 이름");
        for (Student s : this.myList) {
            System.out.println(s.toString());

        }
    }

    public void upload(){
        //System.out.println("upload");
        Student s=new Student();
        id=id+1;
        s.setId(id);
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

        if (this.myList.size() == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
       view();

       System.out.println("수정할 학생의 id를 입력하세요");
       int update_num=sc.nextInt();

        System.out.println("학년 입력:");
        this.myList.get(update_num-1).setGrade(sc.nextInt());
        System.out.println("반 입력:");
        this.myList.get(update_num-1).setClass_num(sc.nextInt());
        System.out.println("번호 입력:");
        this.myList.get(update_num-1).setNum(sc.nextInt());
        System.out.println("이름 입력:");
        this.myList.get(update_num-1).setName(sc.next());

        System.out.println("수정이 완료되었습니다.");


    }

    public void delete(){
        if (this.myList.size() == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        view();

        System.out.println("수정할 학생의 id를 입력하세요");
        int delete_num=sc.nextInt();

        this.myList.remove(delete_num-1);
        System.out.println("삭제가 완료되었습니다.");

    }
}
