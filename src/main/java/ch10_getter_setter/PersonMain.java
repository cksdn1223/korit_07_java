package ch10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("김이");
        Person person3 = new Person(20);
        Person person4 = new Person("김사", 54);

        person1.name = "김일";
        person1.age = -10;
        person2.age = 201;
        person3.name = "김삼";

        // Setter / Getter 의 사용법 -> 얘네는 method
        person1.name = "디카프리오";
//        System.out.println(person1.getName());

//        person4.setAge(789);
//        System.out.println(person4.age);
//        person4.age = 789;
//        System.out.println(person4.age);

        // 이상과 같은 코드 라인은 특정 방법을 사용하면 부정확한 데이터의 입력이 가능
        // 하기 때문에 장기적으로는 method 를 통한 데이터의 입력 / 수정 / 조회가 필요함.

        // .length() -> String 자료형의 글자 수를 return 하는 method
//        System.out.println(person1.name.length());

        person1.setName("노마드코더");
        person1.setName("이일");
    }
}
