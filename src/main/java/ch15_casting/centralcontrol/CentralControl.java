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
        System.out.println("장치가 연결되었습니다.");
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
}
