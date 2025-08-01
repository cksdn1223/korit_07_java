package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(1);
        Constructor constructor3 = new Constructor("김찬우");
        System.out.println(constructor3.name);
    }
}
