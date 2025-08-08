package ch12_arrays;

import java.sql.Array;
import java.util.Scanner;

/*
   메서드를 정의
   String[] scores 배열에
   A / B C / D / F  element 를 입력하고
   실행 예

   A+ B+ C+ D+ F
   가 되도록 코드를 작성하시오.
 */
public class Array05 {
    public void writeElement(String[] strArray) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i< strArray.length ; i++) {
            System.out.print("score 입력 >>> ");
            strArray[i] = scanner.nextLine();
        }
    }
    public void printElement(String[] strArray){
        for(int i = 0 ; i< strArray.length-1 ; i++) {
            System.out.print(strArray[i]+"+ ");
        }
        System.out.print(strArray[strArray.length-1]);
    }
    public static void main(String[] args) {
        String[] scores = new String[5];
        Array05 array05 = new Array05();

        array05.writeElement(scores);
        array05.printElement(scores);
    }
}
