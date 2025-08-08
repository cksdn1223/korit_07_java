package ch13_inheritance;

public class Main {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        Animal animal2 = new Animal("나비");
//        Animal animal3 = new Animal(1);
//        Animal animal4 = new Animal("바둑이",2);
//
//        System.out.println(animal1.getAnimalName());
//
//        Tiger tiger1 = new Tiger();
//        tiger1.setAnimalName("푸바오");
//        tiger1.setAnimalAge(3);
//        String tigerName = tiger1.getAnimalName();
//        int tigerAge = tiger1.getAnimalAge();
//
//        System.out.println("이 호랑이의 이름은" + tigerName + "이고 나이는 " + tigerAge + "살입니다.");
//
//        tiger1.hunt();
//        tiger1.hunt("물고기");
//        tiger1.move();  // 재정의된 move() 호출
//        animal1.move(); // 부모 method 원본 그대로 호출

        Human human = new Human();

        human.setAnimalName("김찬우");
        human.setAnimalAge(25);

        String name = human.getAnimalName();
        int age = human.getAnimalAge();

        human.move();
        System.out.println("안녕하세요, 제 이름은 " + name +
                "이고 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
        human.read("자바의 기초");
    }
}
