package ch14_abstraction.abstract_classes;
/*
    1. Factory 클래스를 상속 받을 것
    2. 오류 해결
    3. TabletFactory의 고유 method인 upgrade(String model) 메서드를 call2 로 정의
    객체명.upgrade("아이패드 프로 13인치 8세대"); 로 호출
    아이패드 프로 13인치 8세대로 업그레이드합니다. 라고 콘솔에 출력
    4. tabletFactory1 객체 생성, 애플 태블릿 공장 이라고 이름 붙일 것
    5. 이름을 구글 태블릿 공장으로 수정할 것 -> getter
    현재 공장은 구글 태블릿 공장으로 변경되었습니다 출력
    6. 객체명.produce("구글 태블릿") 을 호출할 것
    7. 객체명.manage() 를 호출할것
    8. 객체명.upgrade("구글 태블릿 10인치 2세대") 를 호출할 것
    9. Factory 클래스의 인스턴스인 factory2 객체를 생성할 것
        produce() 메서드는 model + 컴퓨터를 생산합니다. 라고 출력될수있도록 재정의
        manage() 메서드는 컴퓨터 공장을 관리합니다. 라고 출력 재정의
        factory2 메서드의 name은 삼성 컴퓨터 공장으로 set
        factory2.showInfo()를 호출

 */
public class TabletFactory extends Factory{
    @Override
    public void produce(String model) {
        System.out.println(model + "을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }

    public void upgrade(String model){
        System.out.println(model+"로 업그레이드합니다.");
    }
}
