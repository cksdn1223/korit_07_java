package practice;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;
class WrongIdPw extends Exception{
    public WrongIdPw(String message){
        super(message);
    }
}
public class PracticeExceptionMap {
    @Getter
    @AllArgsConstructor
    static class User{
        private String id;
        private String pw;

        @Override
        public String toString() {
            return "아이디 : " + this.id + " 비밀번호 : " + this.pw + " / ";
        }
    }

    public static void checkInfo(String id, String pw, Map<User, Integer> info) throws WrongIdPw {
        boolean found = false;
        for(Map.Entry<User, Integer> entry : info.entrySet()){
            User user = entry.getKey();
            Integer number = entry.getValue();
            if(user.getId().equals(id) && user.getPw().equals(pw)){
                found=true;
                System.out.println(number + "번째 유저 로그인 성공");
                break;
            }

        }
        if(!found){
            throw new WrongIdPw("Id Pw 가 잘못되었습니다.");
        }
    }



    public static void main(String[] args) {
        Map<User, Integer> info = new HashMap<>();
        User user1 = new User("id1","pw1");
        User user2 = new User("id2","pw2");
        info.put(user1,1);
        info.put(user2,2);

        try{
            String id = "id2";
            String pw = "pw2";
            checkInfo(id,pw,info);
        } catch (WrongIdPw e){
            System.out.println(e.getMessage());
        }



    }
}