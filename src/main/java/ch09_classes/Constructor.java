package ch09_classes;

public class Constructor {
    int num;
    String name;
    //기본 생성자
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }
    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필요로 요구하는 생성자)");
        this.num = number;  // this : 해당 클래스에서 객체를 생성하게 되면 객체 이름으로 대체됨.
    }
    Constructor(String title){
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
        this.name = title;
    }
    // String title을 매개변수로 하는 생성자를 정의하고,
    // RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)라는 안내문을
    // 출력할 수 있도록 작성한뒤 ConstructorMain으로 가서, constructor3 라는 객체명을 지니고,
    // title에 "여러분이름" 으로 객체를 생성한 후 sout(constructor3.name); 를 입력하여
    // 콘솔에 출력
}
