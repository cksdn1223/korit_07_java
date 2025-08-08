package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "빨강";
        myCar.speed = 160;
        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.speed = 180;
        myCar.drive();
        yourCar.brake();
        myCar.displayInfo();
        yourCar.displayInfo();
    }
}
