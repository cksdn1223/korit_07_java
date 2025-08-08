package ch06_condition;

import java.util.Scanner;

public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        String grade = "";

        // 중첩 if문을 활용한 grade 대입
        if(score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다."); //실행문1
            grade = "X";
        } else {    // 위가 실행이 안됐다면 score는 0이상 100이하라는 의미
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}
