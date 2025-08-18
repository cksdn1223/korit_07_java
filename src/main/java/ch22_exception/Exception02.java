package ch22_exception;

class LoginFailedException extends Exception {
    // 매개변수 생성자
    public LoginFailedException(String message) {
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}
public class Exception02 {
    public static void login(String id, String password) throws LoginFailedException{
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

        if(!id.equals(correctId) || !password.equals(correctPassword)){
//            System.out.println("ID 혹은 비밀번호가 틀렸습니다.");
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
            // argument로 하는 LoginFailedException 객체가 생성되엇다.
        }
    }
    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer";
        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e){   // 자동완성으로 사용자정의 exception 클래스가 나오는데
            // throws LoginFailedException을 작성했기 때문
            System.out.println("로그인 실패 : " + e.getMessage());
            // e.getMessage() 의 결과값이 "ID 또는 PW가 틀렸습니다."라는 것을 확인 가능
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
