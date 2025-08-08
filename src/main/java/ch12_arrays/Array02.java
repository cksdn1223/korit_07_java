package ch12_arrays;

import java.util.Scanner;
/*
    1. humans 배열에 이름을 입력할 수 있도록  함
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일
    2 번 학생의 이름을 등록하세요 >>> 김이
    3 번 학생의 이름을 등록하세요 >>> 김삼
    4 번 학생의 이름을 등록하세요 >>> 김사
    5 번 학생의 이름을 등록하세요 >>> 김오

    2. scores 배열에 점수를 입력
    1번 학생의 점수를 입력하세요 >>> 4.5
    2번 학생의 점수를 입력하세요 >>> 4.4
    3번 학생의 점수를 입력하세요 >>> 4.3
    4번 학생의 점수를 입력하세요 >>> 4.2
    5번 학생의 점수를 입력하세요 >>> 4.1

    학생들의 점수 총합은 21.5점입니다.
 */
public class Array02 {
    public static void main(String[] args) {
        // 우리가 고민해야 할 점
        // 몇명의 학생을 등록하시겠습니까 ? >>> 5
        // 그럼 그 이후에 5명짜리를 등록할 수 있는 빈 배열이 생성되어야 합니다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇명의 학생을 등록하시겠습니까? >>> ");
        int human = scanner.nextInt();
        scanner.nextLine();

        String[] humans = new String[human];
        double[] scores = new double[human];
        double total = 0;

        for (int i = 0 ; i < humans.length ; i++) {
            System.out.print(i+1 + " 번 학생의 이름을 등록하세요 >>> ");
            humans[i] = scanner.nextLine();
        }
        System.out.println();
        for (int i = 0 ; i < scores.length ; i++) {
            System.out.print(i+1 + " 번 학생의 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextDouble();
            total += scores[i];
        }
        System.out.println("\n학생들의 점수 총합은 " + total + "입니다.");

        // [1] ,[3] 에 해당하는 element 만 출력하는 반복문
        for(int i=0; i<human ; i++){
            if(i==3 || i ==1){
                System.out.println(humans[i] + " " + scores[i]);
            }
        }
    }
}
