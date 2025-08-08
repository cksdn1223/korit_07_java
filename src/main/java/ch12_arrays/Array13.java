package ch12_arrays;

import java.util.Arrays;

public class Array13 {
    public static void main(String[] args) {
        int[][] arr03 = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 } };
        System.out.println(arr03[2][0]);
        System.out.println(arr03[2]);
        System.out.println(arr03);
        System.out.println(Arrays.toString(arr03));

        for(int i=0 ; i<arr03.length ; i++){
            for(int j=0 ; j<arr03[i].length ; j++){
                System.out.print(arr03[i][j] + " ");
            }
        }
        System.out.println();

        for(int[] arrs : arr03){
            for(int arr : arrs){
                System.out.print(arr + " ");
            }
        }


    }
}
