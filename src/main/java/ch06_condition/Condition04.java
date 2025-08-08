package ch06_condition;

import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("포인트를 입력하세요 >>> ");
        int point = scanner.nextInt();
        String userGrade = "";

        if(point > 80){
            userGrade = "VIP";
        } else if (point > 60) {
            userGrade = "GOLD";
        }else if (point > 40) {
            userGrade = "SILVER";
        }else if (point > 20) {
            userGrade = "BRONZE";
        } else {        // 여기서 추가
            userGrade = "GENERAL";
        }
        System.out.println("회원 등급 : " + userGrade);
    }
}
