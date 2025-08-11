package ch15_casting.centralcontrol;

import java.util.Arrays;

public class CentralControlMain {

    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
        // 참조 자료형들의 배열을 생성
//        Power[] powers = new Power[5];
        // 이하의 코드는 powers 생성하면서 indexNumber가 고정되기 때문에 안씀
//        Power[] powers = {new Computer(), new AirConditioner(), new Speaker()};
        // 그래서 객체를 만들면서 내부의 필드에 비어있는 Power[] 배열을 집어넣었습니다.
        CentralControl centralControl = new CentralControl(
                new Power[10]);
        centralControl.addDevice(computer1);
        // 메서드에서 Power device 로 매개변수를 받기 때문에
        // computer1 이 자동으로 Power 로 업캐스팅 되어진다
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);

        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        centralControl.addDevice(mouse1);
        centralControl.addDevice(led1);

//        centralControl.powerOn();
//        centralControl.powerOff();
//        System.out.println("-----continue-----");
//        for (int i = 0 ; i < 10 ; i++) {
//            if((i+1)%2 != 1) {
//                System.out.println(i);
//            }
//        }
//        for(int i=0;i<10;i++){
//            if((i+1)%2==1){
//                continue;
//            }
//            System.out.println(i);
//        }
//        centralControl.showInfo();
//        centralControl.performSpecificMethod();

        Printer printer1 = new Printer();
        centralControl.addDevice(printer1);
        centralControl.powerOn();
        centralControl.powerOff();
        centralControl.performSpecificMethod();
    }
}
