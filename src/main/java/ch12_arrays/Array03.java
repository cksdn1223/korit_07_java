package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇명의 학생을 등록하시겠습니까? >>> ");
        int human = scanner.nextInt();
        scanner.nextLine();

        String[] humans = new String[human];
        double[] scores = new double[human];
        double total = 0;

        for (int i = 0 ; i < humans.length ; i++) {
            System.out.print(i+1 + "번 학생의 이름을 등록하세요 >>> ");
            humans[i] = scanner.nextLine();
            System.out.print(humans[i] + " 학생의 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();
            total += scores[i];
        }
        System.out.println();
        for (int i=0 ; i< humans.length ; i++){
            System.out.print(humans[i] + " ");
        }
        System.out.println();
        for (int i=0 ; i< scores.length ; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        System.out.println("\n학생들의 점수 총합은 " + total + "점입니다.");

    }
}