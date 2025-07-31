package ch07_loops;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
//        for (int day = 1 ; day < 6 ; day++){
//            for(int lesson = 1 ; lesson < 4 ; lesson++){
//                System.out.print(day + "일차 " + lesson + "교시입니다. ");
//            }
//            System.out.println();
//        }

//        for (int i=1;i < 10;i++) {
//            for(int dan=2;dan<10;dan++) {
//                System.out.print(dan+"x"+i+"="+dan*i+"  ");
//            }
//            System.out.println();
//        }

        /*
        1 2 3 4 5 .... 10
        11 .... 20
        91.... 100
         */
//        for(int i=1;i<101;i++){
//            System.out.print(i+" ");
//            if(i%10==0){
//                System.out.println();
//            }
//        }

//        for(int i=0;i<10;i++){
//            for(int j=0;j<11;j++){
//                System.out.print(i*10+j + " ");
//            }
//            System.out.println();
//        }

        /*
        숫자를 입력 받아서 n까지 더하는 반복문을 for문으로 작성하시오
        실행 예
        1부터 몇 까지 더하시겠습니까? >>> 10
        1부터 10까지의 합은 55입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
        int num = scanner.nextInt();
        int sum = 0;
        int sumEven =0;
        int sumOdd = 0;
        for (int i=0;i<num+1;i++){
            sum += i;
            if(i%2 == 0){
                sumEven += i;
            } else{
                sumOdd += i;
            }
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
        System.out.println("1부터 " + num + "까지의 짝수합 >>> " + sumEven + "입니다.");
        System.out.println("1부터 " + num + "까지의 홀수합 >>> " + sumOdd + "입니다.");

    }
}
