package com.example.oop.validator.user;

import com.example.oop.validator.ConditionResult;
import com.example.oop.validator.ValidationCondition;

public class UserEmailFormatCondition implements ValidationCondition {

    private final String email;

    public UserEmailFormatCondition(String email) {
        this.email = email;
    }

    @Override
    public ConditionResult validate() {
        if (!this.email.contains("@")) {
            return ConditionResult.fail("email invalid format");
        }

        return ConditionResult.success();
    }

}
