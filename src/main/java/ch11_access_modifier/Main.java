package ch11_access_modifier;

class AccessModifierExample{
    // 필드 선언
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public int getPrivateVar() {
        return privateVar;
    }
}
public class Main {


    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();
        System.out.println(example.publicVar);
        System.out.println(example.protectedVar);
        System.out.println(example.defaultVar);
//        System.out.println(example.privateVar);   // private 접근 지정자이기 때문에 오류 발생
        System.out.println(example.getPrivateVar());    //필드를 직접 호출하는 것이 아니라 getter를 통한 호출

    }
}
