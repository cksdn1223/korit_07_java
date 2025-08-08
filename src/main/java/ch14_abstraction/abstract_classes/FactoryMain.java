package ch14_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성을 '원래는' 못한다.
//        Factory factory1 = new Factory() {
//            @Override
//            public void produce(String model) {
//                System.out.println(this.getName() + "에서 [ " +
//                        model + " ]을 생산합니다.");
//            }
//
//            @Override
//            public void manage() {
//                System.out.println("가전 제품 공장을 관리합니다.");
//            }
//        };  // ;를 꼭 명시해야하는데 이 전체 코드라인이
//        // 메서드를 정의하는 것이 아니라 객체를 생성한 것이기 때문
//        factory1.setName("가전 제품 공장");
//        factory1.showInfo();
//        /*
//            이상의 개념은 익명 클래스
//            람다식(Lambda Expression) 으로 대체되는 경우가 많습니다.
//            (근데 이게 JavaScript에도 동일하게 적용됩니다)
//         */
//        PhoneFactory phoneFactory1 = new PhoneFactory();
//        phoneFactory1.setName("애플 스마트폰 공장");
//
//        // 부모 클래스에서 선언한 추상 클래스를 자식 클래스에서 구현부 작성한대로 작동 되는지 확인
//        phoneFactory1.produce("아이폰 17 에어");
//        phoneFactory1.manage();
//        // 부모클래스의 일반 메서드 호출
//        phoneFactory1.showInfo();
//        /*
//        오버라이딩 개념은 '재정의'를 전제로 부모 클래스와 자식 클래스의 메서드가 '다르게' 굴러갈 경우에만 이루어지면 되고,
//        부모 클래스의 메서드를 동일하게 사용할거라면 애초에 받아올 필요도 없이 그냥 쓰면 됩니다.
//
//        다만 자식 클래스를 정의했을 때 부모 클래스에 특정 메서드가 있음을 명확하게
//        알고 있어야 할 필요가 있음
//         */


        TabletFactory tableFactory1 = new TabletFactory();
        tableFactory1.setName("애플 태블릿 공장");
        tableFactory1.setName("구글 태블릿 공장");
        System.out.println("현재 공장은 " + tableFactory1.getName() +
                "으로 변경되었습니다.");
        tableFactory1.produce("구글 태블릿");
        tableFactory1.manage();
        tableFactory1.upgrade("구글 태블릿 10인치 2세대");

        Factory factory2 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(model + "컴퓨터를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("컴퓨터 공장을 관리합니다.");
            }
        };
        factory2.setName("삼성 컴퓨터 공장");
        factory2.showInfo();
    }
}