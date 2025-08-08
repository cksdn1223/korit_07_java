package ch14_abstraction.interfaces;

public abstract class Button implements Press,Up,Down {

    @Override
    public void onDown() {};

    @Override
    public abstract void onPressed();

    @Override
    public String onUp() {
        return "올립니다.";
    };

}
/*
ChannelDownButton / ChannelUpButton 생성 Button 상속

 */