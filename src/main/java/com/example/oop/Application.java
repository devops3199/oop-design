package com.example.oop;

import com.example.oop.user.User;
import com.example.oop.user.UserServiceV1;
import com.example.oop.user.UserServiceV2;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        String name = "홍길동";
        String email = "hong@naver.com";
        String password = "abc1234!@#$";
        String gender = "M";
        LocalDate birthdate = LocalDate.of(1990, 1, 1);

        User user = new User(name, email, password, gender, birthdate);

        UserServiceV1 userServiceV1 = new UserServiceV1(user);
        userServiceV1.register();

        UserServiceV2 userServiceV2 = new UserServiceV2(user);
        userServiceV2.register();
    }

}
