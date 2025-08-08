package ch12_arrays;

import java.util.Arrays;

public class Array10EnhancedFor {
    public static void main(String[] args) {
//        int[] nums = new int[200];
//
//        for(int i = 0 ; i<200; i++){
//            nums[i] = i+1;
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//
//        for(int num : nums){
//            System.out.print(num + " ");
//        }

        String[] names = {"김일", "김이", "김삼", "김사", "김오"};
        for(int i = 0 ; i<names.length ; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
