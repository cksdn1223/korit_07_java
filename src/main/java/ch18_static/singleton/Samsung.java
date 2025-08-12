package ch18_static.singleton;

import lombok.Getter;

public class Samsung {
    private static Samsung instance;
    @Getter // getCompany()만 만듦
    private String company;
    private int serialNumber;
    private Samsung(){
        company = getClass().getSimpleName();
        serialNumber = 20250000;
    }
    public static Samsung getInstance() {
        if(instance==null) instance = new Samsung();
        return instance;
    }
    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
        /*
        다수의 객체에서 호출하더라도 serialNumber가 중복되지 않을겁니다.
        그러면 정적변수로 선언하고 다수의 객체를 만들어도 안겹칠까요 ?
        >> 안겹칩니다.
         */
    }
}
