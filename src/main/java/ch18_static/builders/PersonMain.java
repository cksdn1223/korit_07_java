package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .address("부산광역시 연제구")
                .name("안근수").age(38).build();
        System.out.println(person);

        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder().
                address("서울").build();
        System.out.println(person3);
    }
}
