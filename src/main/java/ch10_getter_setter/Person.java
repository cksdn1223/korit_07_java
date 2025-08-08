package ch10_getter_setter;
/*

*/
public class Person {
    String name;
    int age;

    // 기본 생성자, 매개변수가 하나인 생성자 두개
    // 매개변수가 두개인생성자 하나 총 4개 정의

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter 정의
    /*
        1. argument로 들어온 String 데이터의 글자수를 파악하고
        2. 4 글자 초과라면 "변경할 수 없습니다." 를 출력한 후 메서드를 종료할 것
        3. 4 글자 이하라면 "이름이 변경되었습니다."
                        "변경 전 : 디카프리오"
                        "변경 후 : 이일"
        4. 이 되도록 작성하고, Personmain 에서 person1의 이름을 변경하시오.
        5. person1.setName("노마드코더")
        6. person1.setName("이일");
        7. 실행 예
            변경할 수 없습니다.
            변경 전 : 디카프리오
            변경 후 : 이일
     */
    public void setName(String title) {
        if(title.length()>4){
            System.out.println("변경할 수 없습니다.");
            return;
        }
        System.out.println("이름이 변경되었습니다.");
        System.out.println("변경 전 : " + name);
        this.name = title;
        System.out.println("변경 후 : " + name);
    }
    public void setAge(int birth){
        if(birth < 0 || birth > 200) {
            System.out.println("불가능한 나이 입력입니다.");
            return;     // method 에서 return; 은 method 즉시 종료 키워드 입니다.
            // 즉 이 이하로는 아예 실행되지 않습니다.
        }
        System.out.println("변경 전 나이 : " + age);
        this.age = birth;
        System.out.println("변경 후 나이 : " + age);
    }
    // Getter 정의
    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }











}
