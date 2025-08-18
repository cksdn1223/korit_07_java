package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        // 속성(키-값 쌍)을 추가하는 메서드 -> addProperty() 메서드
        jsonObject1.addProperty("username",1);
        jsonObject1.addProperty("password",1234);
        jsonObject1.addProperty("email","a@Test.com");
        jsonObject1.addProperty("name","김일");
        jsonObject1.addProperty("score",4.5);
        System.out.println(jsonObject1);
        /*
        Map과의 차이
        1. Map에서는 Key에 ""가 없었고, JSON에서는 모든 Key에 String자료형처럼 보이도록 ""가 있다.
        2. Map에서는 key1=value1의 형태로 작성되어있었지만 JSON에서는 "key1":value1의형태로 작성
         */
        jsonObject1.addProperty("job","코리아아아이이");
        System.out.println(jsonObject1);
        // 가독성이 좋게 외부에서 지원하는방식으로 출력 > PrettyPrinting
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // jsonObject1을 PrettyPrinting이 적용된 문자열 형태로 반환
        String jsonData = gson.toJson(jsonObject1);
        System.out.println(jsonData);
    }
}
