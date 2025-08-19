package practice.test;

class Factory {
    private static Factory instance;
    private String factoryName;

    private Factory(String factoryName) {
        this.factoryName = factoryName;
    }
    public static Factory getInstance(String factoryName){
        if(instance == null) instance = new Factory(factoryName);
        return instance;
    }
}
public class Test2 {
    public static void main(String[] args) {
        System.out.println(Factory.getInstance("공장이름"));
    }
}
