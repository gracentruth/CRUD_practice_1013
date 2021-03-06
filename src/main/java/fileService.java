import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;


public class fileService {

    String filename;

    fileService() {
        String path = Paths.get(".").toAbsolutePath().toString();
        filename = path + "/data.txt";
    }

    public ArrayList<Student> readFile() {
        ArrayList<Student> myList = new ArrayList();
        try {

            //파일 객체 생성
            File file = new File(filename); //

            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(new FileReader(file));
            int i = 0;
            String line = "";
            while ((line = bufReader.readLine()) != null) {

                //System.out.println(line); //한줄씩

                StringTokenizer st = new StringTokenizer(line, "-");//받아온 line을 - 기준으로 쪼개기


                int grade = Integer.parseInt(st.nextToken().trim());


                int class_num = Integer.parseInt(st.nextToken().trim());
                int num = Integer.parseInt(st.nextToken().trim());
                String name = st.nextToken().trim();

                myList.add(new Student(i + 1, grade, class_num, num, name));
                i++;
            }
            bufReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("data.txt 파일이 존재하지 않습니다.");
        } catch (IOException e) {
            System.out.println(e);
        }


        return myList;
    }

    public void SaveFile(ArrayList<Student> list) {
        //파일 객체 생성
        try {
            File file = new File(filename);
            // System.out.println(filename);
            FileUtils.write(file, " ", false);//data.txt 파일내 데이타들을 지워줌
            for (Student s : list) {
                FileUtils.write(file, s.toFString(), true);
                FileUtils.write(file, "\n", true);

            }
            System.out.println("파일에 저장되었습니다.");

        } catch (FileNotFoundException e) {
            System.out.println("data.txt 파일이 존재하지 않습니다.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
