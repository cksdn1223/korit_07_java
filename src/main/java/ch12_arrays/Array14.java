package ch12_arrays;

import java.util.Arrays;

public class Array14 {

    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        //1부터 100까지 값 넣기
        int count = 1;

        for(int i = 0 ; i<nums.length ; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = count++;
            }
        }

        for(int[] num : nums){
            for(int number : num){
                System.out.print(number + " ");
            }
            System.out.println();
        }



//        for(int[] num : nums) {
//            System.out.print(Arrays.toString(num));
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(nums));
    }
}
