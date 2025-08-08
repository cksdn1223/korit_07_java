package ch09_classes.products;

public class Product {
    int productNum;
    String productName;
    // 1. 기본 생성자를 사용하여 객체를 생성하세요 product1
    //     productNum 123456
    //     productName LG엘패드

    public Product() {
    }
    /*
     2. 시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해
     객체를 생성하시오. product2
     productNum 9876564
     productName 다이소충전기
     */

    public Product(int productNum) {
        this.productNum = productNum;
    }
    /*
     3. 제품명을 기본으로 입력하는 매개변수 생성자를 통해
     객체를 생성하시오 product3
     productNum 159357
     productName USB-C 케이블
     */

    public Product(String productName) {
        this.productName = productName;
    }
    /*
     4. AllArgsConsrtuctor를 이용하여 객체 생성하시오. product4
     productNum 951753
     productName GFlip6
     */

    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    public void showInfo(){
        System.out.println();
        System.out.println("시리얼 넘버 : " + productNum);
        System.out.println("제품 타이틀 : " + productName);
    }

}
