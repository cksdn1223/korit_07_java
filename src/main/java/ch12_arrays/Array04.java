package ch12_arrays;

import java.util.Scanner;

/*
    main에서ㅏ 사용하는 불특정 String[] 배ㅔ열을 argument 로 하는 메서드를 호출햇을대
    String[] 내부의 element 들을 한 줄로 출력하는 method를 정의하는 것

    main 에서 사용하는 불특정 String[] 배열을 argument 로 하는 메서드들 호출햇을떄
    String[] 내부 element 들의 값을 하나하나 다 입력받아서 매꾸는 method를 정의
 */
public class Array04 {
    public void printElements() {
        String[] names = { "김일", "김이", "김삼", "김사", "김오", "김육"};

        for (int i = 0 ; i<names.length ; i++) {
            System.out.print(names[i] + " ");
        }
    }
    public void printElements(String[] strArray){
        for(int i=0; i< strArray.length ; i++){
            System.out.print(strArray[i] + " ");
        }
    }
    public void printElements(int[] intArray){
        for(int i=0; i< intArray.length ; i++){
            System.out.print(intArray[i] + " ");
        }
    }
    public void printElements(double[] doubleArray){
        for(int i=0; i< doubleArray.length ; i++){
            System.out.print(doubleArray[i] + " ");
        }
    }

    public void writesElements(String[] strArray){
        // 스캐너 -> 배열에 값 입력
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<strArray.length ; i++){
            System.out.print("이름 입력 >>> ");
            strArray[i] = scanner.nextLine();
        }
    }
    public void writesElements(double[] doubleArray){
        // 스캐너 -> 배열에 값 입력
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i< doubleArray.length ; i++){
            System.out.print("점수 입력 >>> ");
            doubleArray[i] = scanner.nextDouble();
            scanner.nextLine();
        }
    }



    public static void main(String[] args) {
        Array04 array04 = new Array04();

        String[] people = new String[5];
        array04.writesElements(people);
        array04.printElements(people);
        System.out.println();

        double[] scores = new double[5];
        array04.writesElements(scores);
        array04.printElements(scores);
        System.out.println();

//        array04.printElements();
//        System.out.println();
//
//        String[] students = {"이일","이이","이삼","이사","이오"};
//        array04.printElements(students);
//        System.out.println();
//
//        String[] teachers = {"안일", "안이", "안삼", "안사"};
//        array04.printElements(teachers);
//        System.out.println();
//
//        int[] dates = { 2025, 8, 5};
//        array04.printElements(dates);
    }
}
