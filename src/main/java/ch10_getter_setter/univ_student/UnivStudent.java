package ch10_getter_setter.univ_student;
/*
    1. 클래스 설계
        name / grade(1,2,3) / score(double) 로 필드를 정의하시오.
    2. 생성자
        1) 기본 생성자
        2) 이름만 받는 생성자
        3) 학년만 받는 생성자
        4) 이름과 학년을 받는 생성자
        5) 이름, 학년, 점수를 받는 생성자
        를 정의하시오.
    3. Setter / Getter 메서드를 정의하시오.
        setGrade의 범위 1~4학년
        setScore의 범위 0.0 ~ 4.5까지
        범위를 벗어날 경우 불가능한 입력입니다 출력
    4. UnivStudentMain 에서
        student1 -> 기본생성자 김일 / 1 / 3.3
        student2 -> 기본생성자 김이 / 3 / -30 -> 실패하고 4.0 입력
        student3 -> 기본생성자 김삼 / 5 -> 실패하고 2 / 2.7
        student4 -> 기본생성자 김사 / 4 / 3.8
        student5 -> 기본생성자 김오 / 2 / 1.0
        으로 객체 생성하시오.
    5. 콘솔창에
        이름 : 김일
        학년 : 1학년
        점수 : 3.3
        으로 출력될 수 있도록 showInfo() 메서드를 작성 [x|x]
 */
public class UnivStudent {
    String name;
    int grade;
    double score;

    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade>0 && grade <5){
            this.grade = grade;
            return;
        }
        System.out.println("불가능한 입력입니다");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score>=0 && score <=4.5){
            this.score = score;
            return;
        }
        System.out.println("불가능한 입력입니다");
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("점수 : " + score);
        System.out.println();
    }
}
