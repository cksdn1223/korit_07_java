package practice;

import java.util.*;

public class Programmers {
    public static void main(String[] args) {
        int n = 4;
        int[][] answer = new int[n][n];
        int count = 1;
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n ; j++){
                if(answer[i][j]==0) answer[i][j] = count++;
                for(int k = 1; k < n ; k++){
                    if(j==3) {
                        if(answer[k][j]==0) answer[k][j] = count++;
                    }
                }
                if(i==3 && answer[i][j]==0) {
                    answer[n-i-1][j] = count++;
                }
            }
        }
        System.out.println(Arrays.deepToString(answer));


    }
}
