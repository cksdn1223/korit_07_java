package practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class OnlyUseNumber extends Exception{
    public OnlyUseNumber(String message){
        super(message);
    }
}
public class PracticeCalculator{
    Scanner scanner = new Scanner(System.in);
    public void ui(){
        System.out.println("=== 계산기 ===");
        System.out.println("계산은 사칙연산의 법칙에 상관없이 앞에서부터 계산합니다.");
        System.out.print("계산하고 싶은 식을 작성하시오(종료입력시 종료)\n>>>");
        String calc = scanner.nextLine();
        try {
            scanCalc(calc);
        } catch (OnlyUseNumber e) {
            if(!calc.equals("종료")) System.out.println("오류 발생 : " + e.getMessage());
        } finally {
            if(!calc.equals("종료")) ui();
        }
    }
    public void scanCalc(String calc) throws OnlyUseNumber{
        List<String> noNumbers = new ArrayList<>();
        for(char ch : calc.toCharArray()){
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                noNumbers.add(String.valueOf(ch));
                int num = calc.charAt(calc.indexOf(ch) + 1);
                if ((num < 48 || num > 57)){
                    throw new OnlyUseNumber("올바른 식이 아닙니다.");
                }
            }
        }
        if(!calc.contains("+") && !calc.contains("-") && !calc.contains("*") && !calc.contains("/")){
            throw new OnlyUseNumber("+ - * / 이 들어가있지 않습니다.");
        }
        int sum = getSum(calc, noNumbers);
        System.out.println("계산 값 : " + sum);
    }

    private static int getSum(String calc, List<String> noNumbers) {
        String[] numbers = calc.split("[+\\-*/]");
        int sum = Integer.parseInt(numbers[0]);
        for(int i = 1 ; i < numbers.length ; i++ ) {
            if(noNumbers.get(i-1).equals("+")){
                sum += Integer.parseInt(numbers[i]);
            } else if (noNumbers.get(i-1).equals("-")) {
                sum -= Integer.parseInt(numbers[i]);
            } else if (noNumbers.get(i-1).equals("*")) {
                sum *= Integer.parseInt(numbers[i]);
            } else if (noNumbers.get(i-1).equals("/")) {
                sum /= Integer.parseInt(numbers[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        PracticeCalculator start = new PracticeCalculator();
        start.ui();
    }
}
