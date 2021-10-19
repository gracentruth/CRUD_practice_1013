public class Student {

    private int id;
    private int grade;
    private int class_num;
    private int num;
    private String name;

    public Student(){

    }

    public Student(int id, int grade, int class_num, int num, String name) {
        this.id = id;
        this.grade = grade;
        this.class_num = class_num;
        this.num = num;
        this.name = name;
    }

    public String toString(){
        return " "+this.id+" |"+this.grade+"학년 "+this.class_num+"반 "+this.num+"번 "+this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClass_num() {
        return class_num;
    }

    public void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
