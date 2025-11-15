package com.example.oop.validator.user;

import com.example.oop.user.User;
import com.example.oop.validator.ConditionResult;
import com.example.oop.validator.ValidationCondition;

import java.time.LocalDate;

public class UserRegisterFieldsNotNullCondition implements ValidationCondition {

    private final String name;
    private final String email;
    private final String password;
    private final String gender;
    private final LocalDate birthdate;

    public UserRegisterFieldsNotNullCondition(UserRegisterContext context) {
        this.name = context.name();
        this.email = context.email();
        this.password = context.password();
        this.gender = context.gender();
        this.birthdate = context.birthdate();
    }

    @Override
    public ConditionResult validate() {
        if (this.name == null || this.name.isEmpty()) {
            return ConditionResult.fail("name cannot be null or empty");
        }

        if (this.email == null || this.email.isEmpty()) {
            return ConditionResult.fail("email cannot be null or empty");
        }

        if (this.password == null || this.password.isEmpty()) {
            return ConditionResult.fail("password cannot be null or empty");
        }

        if (this.gender == null || this.gender.isEmpty()) {
            return ConditionResult.fail("gender cannot be null or empty");
        }

        if (this.birthdate == null) {
            return ConditionResult.fail("birthdate cannot be null");
        }

        return ConditionResult.success();
    }

}
