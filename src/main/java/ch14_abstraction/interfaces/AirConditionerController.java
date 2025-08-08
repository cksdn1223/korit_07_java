package ch14_abstraction.interfaces;
/*
    PowerButton 포함시킬 것
    TemperatureDownButton,
    TemperatureUpButton,
    ModeChangeButton > 버튼 한번 누를 때 마다 모드가 변환되어야함
    냉방 -> 난방
    Press 버튼을 활용하여 한번 누르면 그 다음모드로 이동

    AllArgsConstructor를정의

    실행 예
    에어컨 리모컨 객체가 생성되었습니다
    전원을 켭니다.
    온도를 한 칸 내립니다.
    온도를 계속 내립니다.
    온도를 한 칸 올립니다
    온도를 계속 올립니다
    난방으로 바뀝니다.
    냉방으로 바뀝니다.
    전원을 끕니다.
 */
public class AirConditionerController {
    private PowerButton powerButton;
    private TemparatureDownButton temparatureDownButton;
    private TemparatureUpButton temparatureUpButton;
    private ModeChangeButton modeChangeButton;

    public AirConditionerController(PowerButton powerButton, TemparatureDownButton temparatureDownButton, TemparatureUpButton temparatureUpButton, ModeChangeButton modeChangeButton) {
        this.powerButton = powerButton;
        this.temparatureDownButton = temparatureDownButton;
        this.temparatureUpButton = temparatureUpButton;
        this.modeChangeButton = modeChangeButton;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다");
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTemparatureUpButton() {
        temparatureUpButton.onPressed();
    }
    public void onUpTemparatureUpButton() {
        System.out.println(temparatureUpButton.onUp());
    }

    public void onPressedTemparatureDownButton() {
        temparatureDownButton.onPressed();
    }
    public void onDownTemparatureDownButton() {
        temparatureDownButton.onDown();
    }

    public void onPressedModChangeButton() {
        modeChangeButton.onPressed();
    }
}
