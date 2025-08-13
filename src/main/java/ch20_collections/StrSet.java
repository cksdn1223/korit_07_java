package ch20_collections;

import java.util.*;

public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet = new HashSet<>();
        // List 객체 생성
        List<String> strList = new ArrayList<>();

        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        System.out.println(strList);

        strSet.add("TypeScript");   // 하나 추가 예시
        System.out.println(strSet);

        strSet.addAll(strList); // strSet에 strList 전부 추가
        System.out.println(strSet);
        System.out.println(strList);
        System.out.println();

        List<String> modifiedStrList = new ArrayList<>();
        modifiedStrList.addAll(strSet);
        System.out.println(modifiedStrList);
        Collections.sort(modifiedStrList);
        System.out.println(modifiedStrList);
        System.out.println();

        System.out.println("====일반 for문====");
        for(int i = 0 ; i < modifiedStrList.size() ; i++) {
            System.out.println(modifiedStrList.get(i) + " 언어");
        }
        System.out.println("====향상된 for문====");
        for(String str : modifiedStrList){
            System.out.println(str + " 언어");
        }
    }
}
