package ch08_methods;

import java.util.Scanner;
public class Method02 {
    public static String getStar(int rows, int option){
        String result = "";
        switch (option){
            case 1:
                for( int i=0 ; i<rows+1 ; i++ ) {
                    for( int j=0 ; j < i ; j++ ) {
                        System.out.print("★");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for ( int i = 0 ; i<rows+1; i++) {
                    for (int j = rows; j - i > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for( int i=0 ; i<rows+1 ; i++ ) {
                    for( int j=rows ; j-i > 0 ; j-- ) {
                        System.out.print("☆");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for ( int i = 0 ; i<rows+1; i++) {
                    for (int k = 0; k < i; k++) {
                        System.out.print(" ");
                    }
                    for (int j = rows; j - i > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("잘못된 번호를 선택하셨습니다.");
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
