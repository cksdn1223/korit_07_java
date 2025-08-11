package ch15_casting.centralcontrol;

import java.util.Arrays;

public class CentralControl{
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public Power[] getDeviceArray() {
        return deviceArray;
    }

    public void addDevice(Power device) {
        // Power의 자식 클래스에 해당하는 인스턴스들을 deviceArray라는
        // 필드에 추가 하고싶으면 CentralcontrolMain 에서 객체 생성을
        // 할때 deviceArray의 최종 indexNumber는 고정되게 되는데
        // 다 들어차있는 배열에 덮어쓰기가 일어나서도 안되고( 즉 기존
        // element를 삭제하면 안됨 ) 비어있는 element에 device 추가를
        // 할 수 있어야합니다. 그렇다면 필요한 기능이 배열 내에 null 값이
        // 존재하는지에 대한 체크가 필요하다고 할 수 있습니다.
        int emptyIndex = checkEmpty(); //method의 결과값을 변수 emptyIndex에 대입
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return; //메서드 종료 키워드
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");
    }

    private int checkEmpty() {  // 메서드인데 private
        // deviceArray 라는 배열에서 비어있는 index를 추출해주기만 하면 되네요
        // i++니까 가장 빨리 만나게 되는 null 값을 retrn 하게 됨
        for(int i = 0 ; i < deviceArray.length ; i++) {
            if (deviceArray[i] == null){
                return i;       //배열 내부에 element가 없다면 그 주소지를 return
            }
        }
        return -1;

    }

    public void powerOn() {
        for(int i = 0 ; i < deviceArray.length ; i++){
            if(deviceArray[i] ==null) {
                System.out.println("장치가 없어 전원을 켜지 않았습니다.");
                continue;
            }
            deviceArray[i].on();
        }
//        for (Power power : deviceArray) {
//            if(power == null) {
//                System.out.println("장치가 없어 전원을 켜지 않았습니다.");
//                continue;
//            }
//            power.on();
//        }
    }

    public void powerOff() {
        for (Power device : deviceArray) {
            if(device == null) {
                System.out.println("장치가 없어 전원을 끄지 않았습니다.");
                continue;
            }
            device.off();
        }
    }
    /*
    객체명.getclass().getSimpleName() 을 활용하면 클래스 네임만 출력된다는 것을 확인
    deviceArray를 반복해서 몇번 인덱스에 어떤 클래스의 객체가 있는지 표시
    showInfo 메서드
    실행 예
    슬롯 [ 1 ] 번 : Computer
    슬롯 [ 2 ] 번 : LED
    ...
    슬롯 [ 10 ] 번 : null
     */
    public void showInfo() {
        int i = 1;
        String name = "";
        for(Power power : deviceArray){
            if (power == null) name = "Empty";
            else name = power.getClass().getSimpleName();
            System.out.println("슬롯 [ " + i++ + " ] 번 : " + name);
        }
    }

    public void performSpecificMethod() {
        for(Power device : deviceArray){
            // Power의 서브클래스가 잘못된 다운캐스팅을 하지 않도록 하는 조건문
            if(device instanceof AirConditioner){ // 명시적 다운캐스팅
                AirConditioner airConditioner = (AirConditioner) device;
                airConditioner.changeMode();
//                ((AirConditioner) device).changeMode();
            } else if(device instanceof Computer){
                Computer computer = (Computer) device;
                computer.compute();
            } else if(device instanceof LED){
                LED led = (LED) device;
                led.changeColor();
            } else if(device instanceof Speaker){
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if(device instanceof Mouse){
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if(device instanceof Printer) {
                Printer printer = (Printer) device;
                printer.print();
            }else if(device==null) {
                System.out.println("장치가 비어있습니다.");
            }else{  // 아직 instanceof 연산자를 통해서 조건문을 추가하지 못한 class 및
                    // 추후 update를 통해서 다른 기기들을 지원할 대는 } else 사이에 else if 문을 추가하면 됨.
                System.out.println("아직 지원하지 않는 기기입니다.");
            }
        }
    }
}

/*
Printer 클래스 정의하고 Power 인터페이스 implement 하고 고유 메서드도 print()
-> "프린터가 인쇄를 합니다" 로 출력
Main에서 printer1 을 centralcontrol에 추가
on() / off() 를 실행한 후에
print() 메서드도 centralcontrol을 통해 실행하시오
 */

/*
.getClass() -> 클래스 명을 return 하는 method + 패키지 경로 포함
.getClass().getSimplename() -> 클래스명만 출력

method의 결과값을 가지고 다시 . 찍어서 그 다음 method 를 호출 했습니다.
이상의 개념을 chaining method 라고 해서 return 값의 유형을 명확하게 알고 있어야 그 다음 어떤 method를 실행신킬 것인지를 알 수 있습니다.
 */