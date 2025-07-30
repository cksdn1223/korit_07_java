package ch06_condition;

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1 = 10;

        // 조건문 적용
        // 실행되는 예시
        if(num1 > 0){
            System.out.println("num1은 양수입니다. ");
        }
        if(num1 > 15) {
            System.out.println("num1은 15 초과입니다.");
        }

        // Scanner import
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 >>> ");
        int num2 = scanner.nextInt();   // 실행하기 전까지 num2 의 값을 모름

        if(num2 > 0){
            System.out.println("num2는 양수입니다.");
        }
        System.out.println("프로그램 종료");
    }
}
