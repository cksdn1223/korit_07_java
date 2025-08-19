package practice.개인연습;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
class User{
    private String username;
    private int age;
    private String email;
    private String country;
    public User(){}
    private User(Builder builder){
        this.username = builder.username;
        this.age = builder.age;
        this.email = builder.email;
        this.country = builder.country;
    }
    public static class Builder{
        private String username;
        private int age;
        private String email;
        private String country;

        public Builder userName(String username){
            this.username = username;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder country(String country){
            this.country = country;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
class UserService{
    private static UserService instance;
    List<User> users = new ArrayList<>();
    private UserService(){}
    public static UserService getInstance(){
        if(instance == null){
            instance = new UserService();
        }
        return instance;
    }
    public void registerUser(User user){
        users.add(user);
    }
    public List<User> getAllUsers(){
        return users;
    }
    public User findByUsername(String username){
        User userr = new User();
        for (User user : users) {
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return userr;
    }
}
public class SingletonBuilderJson {
    public static void main(String[] args) {
        User user1 = new User.Builder().userName("이름1").age(20)
                .email("test1@test.com").country("부산").build();
        User user2 = new User.Builder().userName("이름2").age(20)
                .email("test2@test.com").country("부산").build();
        User user3 = new User.Builder().userName("이름3").age(20)
                .email("test3@test.com").country("부산").build();
        UserService userService = UserService.getInstance();
        userService.registerUser(user1);
        userService.registerUser(user2);
        userService.registerUser(user3);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(userService.getAllUsers());
        System.out.println(json);
//        UserService userrrr = gson.fromJson(json, );
//        System.out.println(userrrr);

        System.out.println(userService.findByUsername("이름1"));
    }
}
