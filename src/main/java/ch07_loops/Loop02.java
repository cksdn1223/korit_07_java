package ch07_loops;
/*
    1 2 3 4 5 6 ... 10
    11 12 13 ... 20
    ...
    91 92 93 ... 100
 */
public class Loop02 {
    public static void main(String[] args) {
        // 반복문을 100 번 돌리는 방법
//        int num1 = 0;
//        while (num1 < 100){
//            System.out.print(++num1 + " ");
//            if(num1 % 10 == 0){
//                System.out.println();
//            }
//        }

        // 반복문을 10번 돌리는 방법
        int j = 1;
        while (j<101){
            System.out.print(j + " " + (j+1) + " " + (j+2));
            j+=10;
        }


//        int num2 = 0;
//        int i = 0;
//        while(i<10){
//            while (num2 < 10){
//                System.out.print(i*10+ ++num2 + " ");
//            }
//            num2 = 0;
//            System.out.println();
//            i++;
//        }
    }
}
