package ch11_access_modifier.bank;
/*
    1. 필드
        accountNum(계좌번호, 정수)
        accountHolder(예금주이름, 문자열)
        balance(잔액, 정수)
        pinNumber(비밀번호,4자리정수0~9999)
    2. 생성자
        기본 생성자
        계좌번호만 있는 생성자
        계좌번호, 예금주 받는 생성자
        계좌번호, 예금주, 초기잔액을 받는 생성자
        계좌번호, 예금주, 초기잔액, 비밀번호를 받는 생성자
    3. 메서드
        Setter / Getter
            특히 Setter의 경우에는 유효성 검증 로직을 삽입해야함.
                -> 잔액은 음수일 수 없음
                -> 비밀번호는 0 이상 9999 이하까지만 가능 -> 실패하면 "불가능한 비밀번호입니다."
        deposit(int amount, int inputPin) -> 입금 관련 메서드
            - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다." 하고 메서드 종료
            - 유효한 금액인지 검증(amount가 0초과인지) -> 실패하면 "불가능한 입력 금액입니다."
            - 콘솔창에
                ~~~~ 원이 입금되었습니다. 현재 잔액 : 00000원

        withdraw(int amount, int inputPin) -> 출금 관련 메서드
            - 올바른 비밀번호 인지 확인 -> 틀리면 "비밀번호가 틀렸습니다." 메서드 종료
            - 유효한 금액 검증 ( amount 0 초과) 실패하면 "불가능한 입력 금액입니다."
            - 출금 후 잔액이 0 이상인지 확인 -> 음수라면 "출금 불가입니다."
            - 콘솔창에
                ~~~~원이 출금되었습니다. 현재 잔액 : 0000원
        showAccountInfo()
            - 콘솔창에
                계좌 번호 : 123456
                계좌 소유자 : 홍길동
                현재 잔액 : 100000원
            라고 출력될수있도록 작성

        계좌 번호 : 123456
        계좌 소유자 : 홍길동
        현재 잔액 : 100000원

        계좌 번호 : 987654
        계좌 소유자 : 신사임당
        현재 잔액 : 500000원

        50000원이 입금되었습니다. 현재 잔액 : 150000원 # account1 에 대한 입금
        잔액이 부족하여 출금할 수 없습니다. #account1에서 200000원 출금 시도 실패사례 20만원
        100000원이 출금되었습니다. 현재 잔액 : 50000원 # account1 에 대한 출금 10만원

        100000원이 출금되었습니다. 현재 잔액 : 400000원 # account2 에 대한 출금
        200000원이 입금되었습니다. 현재 잔액 : 600000원 # account2 에 대한 입금

        최종 계좌 정보
        계좌 번호 : 123456
        현재 잔액 : 50000원

        계좌 번호 : 987654
        현재 잔액 : 600000원

*/
public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setPinNumber(int pinNumber) {
        if(pinNumber<0||pinNumber>9999){
            return;
        }
        this.pinNumber = pinNumber;
    }

    public void deposit(int amount, int inputPin){
        if(pinNumber != inputPin){
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if(amount <= 0){
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        this.balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + balance + "원");
    }

    public void withdraw(int amount, int inputPin){
        if(inputPin != pinNumber){
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if(amount>balance){
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
            return;
        }
        if(amount<0){
            System.out.println("불가능한 출금 금액입니다.");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " + balance + "원");
    }

    public void showAccountInfo(){
        System.out.println("계좌 번호 : " + accountNum);
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("현재 잔액 : " + balance+"원");
        System.out.println();
    }
}
