package ch16_objects;

import java.util.Objects;

public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
    }
    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }

}
