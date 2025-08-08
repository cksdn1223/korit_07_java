package ch12_arrays;

import java.util.Arrays;

/*
    int[] scores = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
    총합과 평균을 계산해서 다음과 같이 출력하시오.
    총점 : ~~점
    평균 : ~~ 점 ( 주의사항 : double 형변환을ㅈ ㅓㄱ용하셔야 합니다.)
 */
public class Array06 {
    public static void main(String[] args) {
        int[] scores = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
        int total = 0;
        double avg = 0;
        for(int i = 0 ; i<scores.length ; i++){
            total += scores[i] ;
        }
        avg = (double) total /scores.length;

        System.out.println("총점 : " + total + "점");
        System.out.println("평균 : " + avg + "점");

    }
}