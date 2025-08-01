package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
        this.studentCode = 2025001;
        this.name = "김일";
        this.score = 4.5;
    }

    public Student2(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다");
        this.studentCode = studentCode;
        this.name = "김이";
        this.score = 4.5;
    }

    public Student2(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = 2025003;
        this.name = name;
        this.score = 95.8;
    }

    public Student2(int studentCode, String name) {
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = 95.8;
    }

    public Student2(int studentCode, String name, double score) {
        System.out.println("int, String, name 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    void showInfo(){
        System.out.println();
        System.out.println(name + "학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
    }
}
