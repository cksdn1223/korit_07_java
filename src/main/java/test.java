import java.util.*;

public class test {
    public static void main(String[] args) {
        String myString = "aaaa";
        String pat = "aa";
        int answer = 0 ;
        for(int i = 0 ; i < myString.length()-pat.length()+1 ; i++){
            System.out.println(myString.substring(i,i+pat.length()));
            if (myString.substring(i,i+pat.length()).equals(pat)){
                answer ++;
            }
        }
        System.out.println(answer);
    }
}