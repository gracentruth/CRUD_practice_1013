import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class Main {

    public static void main(String args[]) throws IOException {
//        String filename;
//        String path= Paths.get(".").toAbsolutePath().toString();
//        filename=path+"/data.txt";
//
//        System.out.println(filename);
//
//        File file=new File(filename);

        //BufferedReader bufReader = new BufferedReader(new FileReader(file));

       // FileReader fr=new FileReader(file);
       // System.out.println(fr.read());
        int menu_num;
        boolean run=true;

        fileService fs=new fileService();
        ArrayList<Student> list= new ArrayList<Student>();

        list=fs.readFile();

        Menu m=new Menu(list);


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
