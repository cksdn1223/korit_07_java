package ch13_inheritance.Products;
/*
    부모 클래스 Item
    자식 클래스 Product
    실행 클래스 ProductMain

    Item 클래스
    field 선언 private String name / private String category
    AllArgsConstructor
    Setter / Getter
    Product에 상속
*/
public class Item {
    private String name;
    private String category;

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
