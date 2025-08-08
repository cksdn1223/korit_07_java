package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    /*
        변수 앞에 public final 생략
     */
//    String age ;
//    public Press(){};
//    void popOut() {
//        System.out.println("추상 메서드 x / 얘는 일반 메서드");
//    }

    // 되는 예시
    void onPressed();
    // 이미 생성된 Up interface에 onUp() 이라는 추상 메서드를 정의하시오.
    // Down interface를 생성하고 onDown() 이라는 추상 메서드를 정의하시오.
}
