package ch08_methods;

public class Overloading {
    public static void add(){
        System.out.println("add()");
    }
    // overloading 적용
    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s);
    }

    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
        System.out.println(a+b);

    }
    public static void add(int a, String s){
        System.out.println("add(int a, String s");
        System.out.println(a + " / " + s);
    }
    public static void add(String s, int a) {
        System.out.println("add(String s, int a");
        System.out.println(a + " / " + s);
    }

    public static void add(int a, int b , double c) {
        System.out.println("add(int a, int b , double c)");
        System.out.println("a + b + c = " + (a + b + c));
    }

    public static void main(String[] args) {
        add();
        add("s");
        add(1,2);
        add(8,"월 1일");
        add("월 1일", 8);
        add(1,2,4.5);
    }
}
