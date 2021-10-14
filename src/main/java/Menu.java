public class Menu {

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

    public  void view(){
        System.out.println("view");
    }

    public void upload(){
        System.out.println("upload");
    }

    public void update(){
        System.out.println("update");
    }

    public void delete(){
        System.out.println("delete");
    }
}
