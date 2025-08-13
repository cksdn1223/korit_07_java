package ch20_collections;

import java.util.*;

public class FieldTrip2 {
    public static void scan(List<String> fieldTripsList){
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까 ? ");
        int student = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0 ; i < student ; i++){
            System.out.print(i+1 + " 번 학생의 수학 여행지를 입력하세요 >>> ");
            fieldTripsList.add(scanner.nextLine());
        }
        System.out.println();
    }
    public static void print(List<String> fieldTripsList){
        for (int i = 0 ; i < fieldTripsList.size() ; i++){
            System.out.println(i+1 + " 번 학생의 후보지 : " + fieldTripsList.get(i));
        }
        System.out.println();
    }
    public static void moveSet(List<String> fieldTripsList, Set<String> fieldTripsSet, List<String> finalFieldTripsList){
        fieldTripsSet.addAll(fieldTripsList);
        finalFieldTripsList.addAll(fieldTripsSet);
        printFinal(finalFieldTripsList);
    }
    public static void printFinal(List<String> finalFieldTripsList){
        System.out.println("수학 여행 후보지는");
        for(String str : finalFieldTripsList){
            System.out.println(str);
        }
        System.out.println("입니다.");
    }
    public static void main(String[] args) {
        List<String> fieldTripsList = new ArrayList<>();
        Set<String> fieldTripsSet = new HashSet<>();
        List<String> finalFieldTripsList = new ArrayList<>();

        scan(fieldTripsList);
        print(fieldTripsList);
        moveSet(fieldTripsList,fieldTripsSet,finalFieldTripsList);

    }
}
