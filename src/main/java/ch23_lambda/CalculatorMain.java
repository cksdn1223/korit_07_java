package ch23_lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a,b);
    }
    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y;   // Calculator 인터페이스의 객체명이 add고, 내부 메서드는 caluclate ()
        Calculator sub = (x, y) -> x - y;   // sub
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println(add.calculate(2,3)); // 올바른 메서드 호출 방식
        System.out.println(sub.calculate(2,3));
        System.out.println("======== static method 호출 방식 결과 ========");
        System.out.println(operate(2,3,add));
        // 세번째 매개변수로 Calculator 인터페이스의 서브 클래스를 받습니다.
        // 리턴문을 보면 해당 객체의 .calculate() 메서드를 호출하는것을 확인 가능
        // add.calculate() 는 return 이 x + y 니까 결과값 5가 나옴
        // 우리는 위 코드의 해석을 위해서 Calculator 인터페이스와 CalculatorMain의 static method와,
        // 그리고 main내에서의 lambda식을 전부 왔다갔다 하면서 볼 필요가 있다는 의미가 됩니다.
        System.out.println(operate(2,3,mul));
    }
}
