package ch09_classes;

import java.util.Scanner;

/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은 것
    형식 :   (접근제어자) 리턴타입 메서드명(매개변수1, 매개변수2) {
                메서드 내부에서 순차적으로 실행될 코드들 -> 이 묶음을 비즈니스 로직이라기도 합니다.
            }
    정의 예시 :
        public void writeSchedule(String date, String content) {
            System.out.println(date + "일의 스케줄은 다음과 같습니다.");
            System.out.println(content);
        }
   호출 예시 :
    객체명.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");
*/
public class ReviewMethod {
    //메서드 정의 영역
    public void writeSchedule(String date, String content) {
        System.out.println(date + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }

    public void writeSchedule(int date, String content){
        System.out.println(date + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }


    public void dividedBySeven(int num){
        if(num%7==0){
            System.out.println(num + "은 7의 배수입니다.");
        } else {
            System.out.println(num + "은 7의 배수가 아닙니다.");
        }
    }
    public void dividedBySeven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("임의의 숫자를 입력하세요 >>> ");
        int num = scanner.nextInt();
//        if(num%7==0){
//            System.out.println(num + "은 7의 배수입니다.");
//        } else {
//            System.out.println(num + "은 7의 배수가 아닙니다.");
//        }
        dividedBySeven(num);
    }
    // writeSchedule 을 overloading 하여 매개변수1의 자료형을 int로 바꾸고,
    // writeSchedule(20250805, "클래스/getter/setter 예습"); 을 호출하시오.
    // dividedBySeven 메서드를 정의.
    // 특정 int 숫자 하나를 매개변수로 받아, 그 숫자가 7의 배수인지 아닌지를 확인하는 메서드 작성
    // 실행 예
    // 임의의 숫자를 입력하세요 >>> 77
    // 77은 7의 배수입니다.
    // 임의의 숫자를 입력하세요 >>> 100
    // 100은 7의 배수가 아닙니다.
    public static void main(String[] args) {
        //메서드 호출 영역
        ReviewMethod reviewMethod = new ReviewMethod();
//        reviewMethod.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");
        reviewMethod.writeSchedule(20250805, "클래스/getter/setter 예습");

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("임의의 숫자를 입력하세요 >>> ");
//        int num = scanner.nextInt();
//        reviewMethod.dividedBySeven(num);
//        System.out.print("임의의 숫자를 입력하세요 >>> ");
//        num = scanner.nextInt();
//        reviewMethod.dividedBySeven(num);
        reviewMethod.dividedBySeven();
        reviewMethod.dividedBySeven();


    }
}
