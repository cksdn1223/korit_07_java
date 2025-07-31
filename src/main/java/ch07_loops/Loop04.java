package ch07_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        // 1부터 100까지를 출력하는 for문
//        for(int i = 1 ; i < 101 ; i++){
//            System.out.println(i);
//        }
        // 1부터 100까지의 합을 구하고 한 번만 출력하시오.
//        int sum=0;
//        for (int i=0;i<101;i++){
//            sum+=i;
//        }
//        System.out.println("1부터 100까지의 합 : " + sum);
        // 1부터 100까지 중 홀수 합을 구하는 for 문을 작성하시오.
//        int sum = 0;
//        for(int i = 0 ; i < 101 ; i ++){
//            if(i%2!=0){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);


//        sum = 0;
//        for(int i = 1 ; i < 101 ; i += 2){
//            sum+=i;
//        }
//        System.out.println(sum);

        /*
        숫자를 입력받아서 1부터 n까지 더하는 반복문을 작성하겠습니다.

        실행 예
        1부터 몇 까지 더하시겠습니까? >>> 10
        1부터 10까지의 합은 55입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i=0;i<num+1;i++){
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");

    }
}
