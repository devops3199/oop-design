package com.example.oop.validator.user;

import com.example.oop.user.User;

import java.time.LocalDate;

public record UserRegisterContext(
    String name,
    String email,
    String password,
    String gender,
    LocalDate birthdate
) {

    public static UserRegisterContext from(User user) {
        return new UserRegisterContext(user.getName(), user.getEmail(), user.getPassword(), user.getGender(), user.getBirthdate());
    }

}
