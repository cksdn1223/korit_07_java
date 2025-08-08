package ch11_access_modifier;
/*
    목표 : 객체 지향 설계 및 접근 지정자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의하고
    이를 characterMain 클래스에서 기능 테스트를 수행

    클래스 설계
    1. 필드
    name - 캐릭터 이름(공개 가능)
    health - 체력 -> 읽기만 허용
    power - 공격력 -> 같은 패키지만
    skill - 스킬이름 -> 자식 클래스만
    exp - 경험치 -> 외부에서 완전 차단

    Character 클래스의 인스턴스인 warrior
    이름 전사
    체력 100
    공격력 200
    스킬 세로베기
    exp 30
    으로 기본 생성자를 통해 생성, setter를 통해 데이터를 집어넣으시오

    메서드 정의
    getHealth() -> 체력 값 반환 getter -> public
    attack() -> 공격 시 콘솔 창에
        name 이 power로 공격 !
        name 이(가) 경험치 amount을 (를) 얻었습니다
    heal() -> 체력을 10 회복하고, 현재 체력 출력
        체력이 10 회복되었습니다. 현재 체력 : health
    gainExp(int amount)
        실행 예
        name이(가) 경험치 amount()을(를) 얻었습니다.
 */
class Character {
    public String name;
    private int health;
    int power;
    protected String skill;
    private int exp;
    //생성자 ( 캐릭터 생성시에 필수적으로 요구되는 애들만 매개변수로 받은 생성자 )
    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health = 100;
        this.exp = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getSkill() {
        return skill;
    }

    public int getExp() {
        return exp;
    }

    public void attack() {
        System.out.println(name + "이(가) " + power + "의 힘으로 공격합니다 !");
        this.gainExp(30);
    }
    private void gainExp(int amount) {
        exp += amount;
        System.out.println(name + "이(가) 경험치를 " + amount + " 얻었습니다.");
    }
    public void heal() {
        health += 10;
        System.out.println(name + "의 체력이 회복되었습니다. 현재 체력 : " + health);
    }

}

public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character("전사",200,"세로베기");
//        warrior.setName("전사");
//        warrior.setHealth(100);
//        warrior.setPower(200);
//        warrior.setSkill("세로베기");
//        warrior.setExp(30);

        warrior.attack();
        warrior.heal();
    }
}
