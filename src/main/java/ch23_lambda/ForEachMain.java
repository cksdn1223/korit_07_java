package ch23_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        System.out.println(fruits);

        // 각 element 를 추출하기 위해서 for문 / 향상된 for문을 사용해왔습니다
        // 1. 일반 for
        for( int i = 0 ; i < fruits.size() ; i++ ){
            System.out.println("과일명 : " + fruits.get(i));
        }
        System.out.println();
        // 2. 향상된 for
        for( String fruit : fruits){
            System.out.println("과일명 : " + fruit);
        }
        System.out.println();
        // 3. 람다식 적용한 method ForEach
        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.print((number*2) + " "));

    }
}
