package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Java!");
            }
        };

        runnable.run(); // 이상의 방법은 메서드 명이 명시되니까 편한데

        Runnable lambdaRunnable = () -> System.out.println("Hello, Lambda!");
        lambdaRunnable.run();   // 얘는 메서드명이 없다.
        // 다른 유형의 함수형 인터페이스 실행 예제

        // 2. Consumer
        Consumer<String> stringConsumer = memo -> System.out.println("메시지 : " + memo);
        stringConsumer.accept("오늘");

        // 3. Supplier
        Supplier<String> stringSupplier = () -> "Hello, Supplier!";
        System.out.println(stringSupplier.get());
        String message = stringSupplier.get();
        System.out.println(message);


    }
}
