package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드 정의
    private String factoryName;

    // 메서드 정의
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");
        // 접근 지정자 안썼으니까 default 그리고 지역 변수
        String model = "갤럭시S26";
        String serial;

        Samsung samsung = Samsung.getInstance();
        // Samsung 객체를 생성 어차피 동일한 객체가 계속 불러와짐 싱글톤
        serial = samsung.createSerialNumber(model);
        // 리턴 타입이 Smartphone >> SmartPhone 객체 필요
        // 스마트폰 객체 생성할 때 AllArgsConstructor
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model,serial);
        return smartPhone;
    }
}
