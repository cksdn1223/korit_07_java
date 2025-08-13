package ch20_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // 1. Array와의 차이점
        // 선언 방식
        List<String> strList = new ArrayList<>();
        String[] strArray = new String[5];
        // List의 경우 인덱스 넘버 고정이 없지만, 배열의 경우 인덱스 넘버를 고정해줘야만 합니다.

        // 2. 값을 대입하는 방법
        // 배열
        strArray[0] = "김영";
        strArray[4] = "김사";
        // List -> 메서드를 통해 집어넣습니다.
        strList.add("java");
        // python / javascript / C# / C++
        strList.add("python");
        strList.add("javascript");
        strList.add("C#");
        strList.add("C++");
        // 순서가 보장됨으로 집어넣은 순서대로 값이 들어갑니다.

        // 3. 출력 방식
        // Array
        System.out.println(Arrays.toString(strArray));
        // List
        System.out.println(strList);

        // 특정 element(List 내의) 검색 -> contains() 메서드 사용
        String searchElem1 = "python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(contains1);

        String searchElem2 = "py";
        boolean contains2 = strList.contains(searchElem2);
        System.out.println(contains2);
        /*
        List는 element가 명확하게 일치하는지를 확인함
        그래서 py가 python 이라는 String 데이터의 일부이기는 하지만  element 전체를 의미하지는 않기 때문에 flase
         */
        //특정 element의 삭제 -> remove();
        String removeElem1 = "javascript";
        boolean isRemoved = strList.remove(removeElem1);
        System.out.println(isRemoved );
        // FIFO / .pop() -> 삭제 여부가 아니라 collection에서 삭제하고 삭제된 element를 return 함
        System.out.println(strList);
        // List의 정렬
        Collections.sort(strList);  // 배열 정렬할 때랑 같다. 원본 List의 결과값을 바꿉니다.
        System.out.println(strList);
        // List의 역순 정렬
        Collections.sort(strList, Comparator.reverseOrder());
        System.out.println(strList);
        System.out.println("=".repeat(50));
        System.out.println("====일반 for문====");
        for(int i = 0 ; i < strArray.length ; i++){
            System.out.print(strArray[i] + " ");
        }
        System.out.println("\n====향상된 for문====");
        for(String str : strArray){
            System.out.print(str + " ");
        }
        System.out.println("\n====일반 for문====");
        for(int i = 0 ; i < strList.size() ; i++){
            System.out.print(strList.get(i) + " ");
        }
        System.out.println("\n====향상된 for문====");
        for (String s : strList) {
            System.out.print(s + " ");
        }
    }
}
