package com.example.oop.user;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {

    private final String name;
    private final String email;
    private final String password;
    private final String gender;
    private final LocalDate birthdate;

    public User(String name, String email, String password, String gender, LocalDate birthdate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getBirthdateStr() {
        return birthdate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

}
