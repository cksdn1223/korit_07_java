package ch06_condition;

public class Condition02 {
    public static void main(String[] args) {
        int num1 = 0;
        if(num1>0){     //현재 false 이기 때문에
            System.out.println("num1은 양수입니다.");
        } else {        // else에 딸린 실행문2 출력
            System.out.println("num1은 0이거나 음수입니다.");
        }
    }
}
