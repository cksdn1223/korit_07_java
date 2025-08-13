package ch19_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;
    /*
    현재 AnimalData의 필드인 animal 에 Animal 클래스의 상속을 받은
    Tiger / Human 객체를 필드에 대입할겁니다.

    귿네 T에는 어떤 클래스도 들어갈 수 있기 때문에 현재 상황에서는 Car 클래스의 객체도
    animal 필드에 들어갈 수 있을겁니다.
    특정 클래스라면 ( 즉 Animal 클래스의 상속을 받은 서브클래스라면 ) 해당 클래스에 맞는 객체 정보를
    출력하도록 할겁니다.
     */
    public void showData() {
        ((Animal) animal).move();
        // AnimalData의 필드인 animal을 Animal 타입으로 형변환해서 .move() 메서드를 호출 함
        if (animal.getClass() == Human.class){
            ((Human)animal).read(); // 필드에9 들어간 animal 객체의 클래스를 확인하여 그것이 Human 클래스라면 read() 호출
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger)animal).hunt();
        }
    }
}
