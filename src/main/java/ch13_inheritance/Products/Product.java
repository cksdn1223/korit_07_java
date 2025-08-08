package ch13_inheritance.Products;
/*

 */
public class Product extends Item{
    // 자식 고유의 field 정의
    private int price;
    private int stock;

    // 이거는 부모 생성자를 호출한건데, Product 클래스의 AllArgsConstructor 를 만들고싶다면
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void showInfo() {
        System.out.println("제품명 : " + getName());
        System.out.println("카테고리 : " + this.getCategory());
        System.out.println("가격 : " + price);
        System.out.println("재고 : " + stock);
    }
}
