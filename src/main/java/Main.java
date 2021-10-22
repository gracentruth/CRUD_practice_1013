import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]){


       // ArrayList<Student> list= new ArrayList<Student>();

        int menu_num;
        boolean run=true;

        fileService fs=new fileService();

       Menu m=new Menu();


       Scanner sc=new Scanner(System.in);


       while(run){
           m.printMenu();
           menu_num=sc.nextInt();

           switch (menu_num) {

               case 1:
                   m.view();
                   break;
               case 2:
                   m.upload();
                   break;
               case 3:
                   m.update();
                   break;
               case 4:
                   m.delete();
                   break;

               case 0:
                   System.out.println("종료");
                   run = false;
           }


       }

    }
}
