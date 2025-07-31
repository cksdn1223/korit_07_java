package ch07_loops;

public class Loop03 {
    public static void main(String[] args) {
//        int day = 1;
        // 1일차 1교시입니다. ~ 1일차 3교시입니다.
        // 2일차 1교시입니다. ....
        // 5일차 1교시입니다. ~ 5일차 3교시입니다.

//        while (day<6){
//            int lesson = 1; //반복실행문 1-a 에 해당합니다. 변수의 선언 및 초기화
//            while(lesson<4){
//                System.out.print(day+"일차 " + lesson + "교시입니다. ");   // 반복실행문2 에 해당
//                lesson++;
//            }
//            System.out.println();
//            day++;  //반복실행문1-b에 해당
//        }

        // scope(범위) 라는 것, 전역(전체영역) / 지역으로 나뉜다는 점

        /*
            이상의 코드를 활용하여
            2 x 1 = 2
            2 x 2 = 2
            ...
            9 x 9 = 81
            을 출력하시오.
         */
        int dan = 2;

        while(dan < 10){
            System.out.println(" [ " + dan+"단" + " ] ");
            int i = 1;
            while (i<10){
                System.out.println(dan + " x " + i + " = " + dan*i);
                i++;
            }

            dan++;
        }
//        int i = 1;
//        while (i < 10) {
//            dan = 2;
//            while (dan<10){
//                System.out.print(dan+"x"+i+"="+dan*i+" ");
//                dan++;
//            }
//            System.out.println();
//            i++;
//        }








    }
}
