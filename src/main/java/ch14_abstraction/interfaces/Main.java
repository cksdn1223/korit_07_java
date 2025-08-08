package ch14_abstraction.interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, channelDownButton, channelUpButton
//        );
//
//        tvRemoteController.onPressedPowerButton();
        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                new PowerButton(), new ChannelDownButton(), new ChannelUpButton()
//        );
//
//        tvRemoteController.onPressedPowerButton();
//        tvRemoteController.onPressedChannelDownButton();
//        tvRemoteController.onDownChannelDownButton();
//        System.out.println();
//        tvRemoteController.onPressedChannelUpButton();
//        System.out.println(tvRemoteController.onUpChannelUpButton());
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                new VolumeDownButton(), new VolumeUpButton()
//        );
//        tvRemoteController.onPressedVolumeDownButton();
//        tvRemoteController.onDownVolumeDownButton();
//        tvRemoteController.onPressedVolumeUpButton();
//        System.out.println(tvRemoteController.onUpVolumeUpButton1());
//        tvRemoteController.onUpVolumeUpButton2();
        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(),new TemparatureDownButton(), new TemparatureUpButton()
                , new ModeChangeButton()
        );

        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemparatureDownButton();
        airConditionerController.onDownTemparatureDownButton();
        airConditionerController.onPressedTemparatureUpButton();
        airConditionerController.onUpTemparatureUpButton();
        airConditionerController.onPressedModChangeButton();
        airConditionerController.onPressedModChangeButton();
        airConditionerController.onPressedPowerButton();
    }
}