package ch13_inheritance;

public class Tiger extends Animal{
    // 고유메서드 # 1
    public void hunt(){
        System.out.println(getAnimalName() + "이 사냥을 합니다.");
    }
    // 고유메서드 # 2 오버로딩 적용
    public void hunt(String prey){
        System.out.println(getAnimalName() + "이 " + prey +"를 사냥 합니다.");
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName()+"님";
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override   // method 명만 동일하고 전부 재정의
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }
}
