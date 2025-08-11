import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] arrs = {293, 1000, 395, 678, 94};
        List<Integer> numbers = new ArrayList<>();
        for(int arr:arrs){
            numbers.add(arr);
        }
        int[] delete_lists = {94, 777, 104, 1000, 1, 12};
        List<Integer> lists = new ArrayList<>();
        for(int delete_list : delete_lists){
            for(int arr : arrs){
                if(arr == delete_list){
                    lists.add(arr);
                }
            }
        }
        for(int num : lists){
            numbers.remove((Integer) num);
        }
        System.out.println( numbers.stream().mapToInt(i->i).toArray());

    }
}
