package ch08_methods;

import java.util.Scanner;
public class Method02 {
    public static String getStar(int rows, int option) {
        String result = "";
        if(option == 1) {
            for (int i = 0 ; i < rows + 1 ; i++) {
                for (int j = 0 ; j < i ; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 2) {
            for ( int i = 0 ; i < rows ; i++) {
                // 공백 관련 for문
                for( int j = 0 ; j < rows - (i + 1) ; j++ ) {
                    result += "  ";
                }
                // 별찍기 관련 for문
                for ( int k = 0 ; k < i + 1 ; k++ ) {
                    result += "✌️";
                }
                result += "\n";
            }
        } else if (option == 3) {
            for ( int i = 0 ; i < rows ; i++ ) {
                for ( int j = rows ; j > i ; j-- ) {
                    result += "😎";
                }
                result += "\n";
            }
        } else if (option == 4) {
            for ( int i = 0 ; i < rows ; i++ ) {
                for ( int j = 0 ; j < i + 1 ; j++ ) {
                    result += "  ";
                }
                for ( int k = rows ; k > i ; k-- ) {
                    result += "🎈";
                }
                result += "\n";
            }
        } else {
            result = "해당 기능이 없습니다";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("선택 >> ");
        choice = scanner.nextInt();
        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);
        /*
            영어();
            라고 되어있는 부분에서 괄호 있는 영단어/문장이 사실은 메서드 였다는 점
            scanner.nextLine();
            System.out.println("특정내용");
            과 같은 식으로 영어로 명령어를 쓰고 소괄호를 적용한 모든 것들이 메서드와 관련된 부분이었음.
         */
    }
}
