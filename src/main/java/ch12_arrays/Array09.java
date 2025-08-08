package ch12_arrays;

import java.util.Scanner;

public class Array09 {

    public static void main(String[] args) {
        Array08 array08 = new Array08();
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7,8,10};
        int sum = array08.calcSum(nums);
        double avg = array08.calcAvg(nums);
        int randomNum = scanner.nextInt();
    }
}
