package ch19_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();

        ResponseData<String> responseData = new ResponseData<>("날짜 저장 성공", now.toString());
        System.out.println(responseData);
        ResponseData<Integer> responseData2 = new ResponseData<>("날짜 저장 성공", 14);
        System.out.println(responseData2);
        ResponseData<Date> responseData3 = new ResponseData<>("날짜 저장 성공", now);
        System.out.println(responseData3);

    }
}
