package ch12_arrays;

import ch08_methods.Method01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array12 {

    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//*-
//        int num1 = random.nextInt();
//        System.out.println(num1);
//        System.out.print("숫자 입력 >>> ");
//        int num2 = scanner.nextInt();
//        System.out.println(num2);
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));

        Method01.call1();
        System.out.println(Method01.call3());

        Integer[] nums = { 3, 6, 7, 1, 9, 2, 10, 5, 4, 8 };
        System.out.println("정렬 전 배열 : " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("오름차순 정렬 후 배열 : " + Arrays.toString(nums));
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후 배열 : " + Arrays.toString(nums));
    }
}
