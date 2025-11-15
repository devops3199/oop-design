package com.example.oop.user;

import java.time.LocalDate;
import java.time.Period;

public class UserServiceV1 {

    private final User user;

    public UserServiceV1(User user) {
        this.user = user;
    }

    public void register() {
        if (user == null) {
            throw new IllegalArgumentException("없는 유저");
        }

        if (user.getName() == null || user.getName().isEmpty() || user.getName().length() > 10) {
            throw new IllegalArgumentException("유효하지 않은 이름");
        }

        if (user.getEmail() == null || user.getEmail().isEmpty() || !user.getEmail().contains("@")) {
            throw new IllegalArgumentException("유효하지 않은 이메일");
        }

        if (user.getPassword() == null || user.getPassword().isEmpty() || user.getPassword().length() < 8) {
            throw new IllegalArgumentException("유효하지 않은 비밀번호");
        }

        if (user.getGender() == null || user.getGender().isEmpty() || !user.getGender().equals("M") || !user.getGender().equals("F")) {
            throw new IllegalArgumentException("유효하지 않은 성별");
        }

        if (user.getBirthdate() == null) {
            throw new IllegalArgumentException("유효하지 않은 생년월일");
        }

        LocalDate currentDate = LocalDate.now();
        Period agePeriod = Period.between(user.getBirthdate(), currentDate);

        if (agePeriod.getYears() < 18) {
            throw new IllegalArgumentException("18세 미만");
        }

        // create user

        // create welcome coupon

    }

}
