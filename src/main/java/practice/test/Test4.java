package practice.test;

import lombok.AllArgsConstructor;

import java.util.*;

public class Test4 {
    @AllArgsConstructor
    public static class UserInfo {
//        private String name;
        private String rating;
        private int age;

        @Override
        public String toString() {
            return "\nrating="+rating
                    +"\nage="+age+"\n";
        }
    }

    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<>();
        Map<String, Object> user1 = new HashMap<>();
        Map<String, Object> user2 = new HashMap<>();
        UserInfo userInfo1 = new UserInfo("vip", 30);
        UserInfo userInfo2 = new UserInfo("gold", 35);
        user1.put("홍길동", userInfo1);
        user2.put("김기영", userInfo2);
        customers.add(user1);
        customers.add(user2);

        for(Map<String, Object> customer : customers){
            for(String name : customer.keySet()){
                System.out.print("name="+name);
                System.out.print(customer.get(name));
            }
        }
    }
}