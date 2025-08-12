package ch18_static.singleton.products;

public class ProductView {
    // 정적 변수 선언
    private static ProductView instance;    // ProductView 클래스의 정적 field인 instance
    // private 로 생성자를 선언 -> 객체 하나만 생성하는걸 보장하기위함
    private ProductView() {
        int counter = 1;    // 지역변수
        System.out.println(counter + "번 째 객체가 생성되었습니다.");
        counter++;
    }
    // static 메서드 정의
    public static ProductView getInstance(){
        if(instance == null) instance = new ProductView();
        return instance;
    }
}
