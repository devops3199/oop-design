package com.example.oop.validator.user;

import com.example.oop.validator.ConditionResult;
import com.example.oop.validator.ValidationCondition;

public class UserPasswordLengthCondition implements ValidationCondition {

    private final String password;

    public UserPasswordLengthCondition(String password) {
        this.password = password;
    }

    @Override
    public ConditionResult validate() {
        if (this.password.length() < 8) {
            return ConditionResult.fail("password must be greater than 8 characters");
        }

        return ConditionResult.success();
    }

}
