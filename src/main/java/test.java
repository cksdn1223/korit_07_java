import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {
                {0, 4, 2},
                {0, 3, 2},
                {0, 2, 2}
        };
        int[] answer = new int[queries.length];
        for(int j = 0; j < queries.length ; j++){
            List<Integer> lists = new ArrayList<>();
            for(int num : queries[j]){
                lists.add(num);
            }
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            int temp = 0;
            for(int num = 0 ; num <= e ; num++){
                if(s<=num&&num<=e){
                    if(temp==0){
                        if(arr[num]>k) temp = arr[num];
                    } else {
                        if(arr[num]>k) {
                            if(temp > arr[num]) temp = arr[num];
                        }
                    }
                }

            }
            if(temp==0) temp = -1;
            answer[j] = temp;


        }
        System.out.println(Arrays.toString(answer));

    }
}
