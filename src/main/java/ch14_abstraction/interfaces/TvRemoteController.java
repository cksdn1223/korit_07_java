package ch14_abstraction.interfaces;

public class TvRemoteController {
//    private PowerButton powerButton;
//    private ChannelDownButton channelDownButton;
//    private ChannelUpButton channelUpButton;

//    public TvRemoteController(PowerButton powerButton,
//                              ChannelDownButton channelDownButton,
//                              ChannelUpButton channelUpButton) {
//        this.powerButton = powerButton;
//        this.channelDownButton = channelDownButton;
//        this.channelUpButton = channelUpButton;
//    }
    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
//    public void onPressedPowerButton() {
//        powerButton.onPressed();
//    }
//    public void onPressedChannelDownButton() {
//        channelDownButton.onPressed();
//    }
//    public void onDownChannelDownButton() {
//        channelDownButton.onDown();
//    }
//    public void onPressedChannelUpButton() {
//        channelUpButton.onPressed();
//    }
//    public String onUpChannelUpButton() {
//        return channelUpButton.onUp();
//    }

    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    public String onUpVolumeUpButton1() {
        return volumeUpButton.onUp();
    }
    public void onUpVolumeUpButton2() {
        System.out.println(volumeUpButton.onUp());
    }
}
