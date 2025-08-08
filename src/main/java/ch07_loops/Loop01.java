package ch07_loops;

public class Loop01 {
    public static void main(String[] args) {
        // 1부터 100까지 출력하는 예시
//        int i = 1;
//        while (i<101) {
//            System.out.println(i);
//            i++;        // i를 증가시켜서 특정 시점에 조건이 false가 되도록 지정
//        }
//
//        int j = 0;
//        while (j<100){
//            System.out.println(++j);
//        }

        // 그래서 1부터 10까지의 합을 구하는 방식
//        int num1 = 1;
//        int sum = 0;
//        // 을 이용하여 1부터 100까지의 합을 구하시오.
//        while(num1 < 101){
//            sum+=num1++;
//            sum = sum + num1;
//            num1++;
//        }
//        System.out.println("합 : " + sum);

//        int num2 = 0;
//        int sum2 = 0;
//        while(num2 < 100){
//            sum2 += ++num2;
//            //++num2;
//            //sum2 = sum2 + num2;
//        }
//        System.out.println(sum2);

//        int sum = (100 * 101 / 2);
//        System.out.println("등차수열의 합계 공식 이용 : " + sum);
        /*
        사실 1부터 1씩 증가하는 합 공식은 while 반복문을 쓰는 것 자체가
        오히려 비효율적이라는 사실을 확인할 수 있습니다.

        하지만 while문 자체는 Java 문법이고, if에서와 동일하게 중첩적으로 사용이 가능합니다.
        그리고 while문 내부에 if문이 들어가는 등의 응용도 가능합니다.
         */

        /*
            1부터 100까지
            1 2 3 4 5 6 ... 100 으로 출력하시오
         */
        int k = 0;
        while(k<100){
            System.out.print(++k + " ");
        }
//        System.out.println();
//        k = 1;
//        while (k<101){
//            System.out.print(k++ + " ");
//        }



    }
}
