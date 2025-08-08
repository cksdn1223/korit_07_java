package ch12_arrays;

import java.util.Arrays;

public class Array08 {
    public int calcSum(int[] intArr){
        int sum =0;
        for (int i = 0 ; i< intArr.length ; i++){
            sum += intArr[i];
        }
        return sum;
    }
    public double calcAvg(int[] intArr){
        return (double) calcSum(intArr)/intArr.length;
    }
    public static void main(String[] args) {
        Array08 array08 = new Array08();
        int[] scores = {100, 97, 55, 24, 49, 60, 20, 77, 89 };
        System.out.println("총합 : " + array08.calcSum(scores) + "점");
        System.out.println("평균 : " + array08.calcAvg(scores) + "점");
//        System.out.printf("평균 : %.2f점\n",array08.calcAvg(scores));
    }
}